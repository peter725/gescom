package es.consumo.gescom.modules.protocol.service.impl;

import es.consumo.gescom.commons.dto.wrapper.CriteriaWrapper;
import es.consumo.gescom.modules.campaign.model.converter.CampaignConverter;
import es.consumo.gescom.modules.campaign.model.entity.CampaignEntity;
import es.consumo.gescom.modules.campaign.repository.CampaignRepository;
import es.consumo.gescom.modules.proponent.model.converter.ProponentConverter;
import es.consumo.gescom.modules.protocol.model.converter.ProtocolConverter;
import es.consumo.gescom.modules.protocol.model.criteria.ProtocolCriteria;
import es.consumo.gescom.modules.protocol.model.dto.ProtocolDTO;
import es.consumo.gescom.modules.protocol.model.entity.ProtocolEntity;
import es.consumo.gescom.modules.protocol.repository.ProtocolRepository;
import es.consumo.gescom.modules.protocol.service.ProtocolService;
import es.consumo.gescom.modules.questions.model.dto.QuestionsDTO;
import es.consumo.gescom.modules.questions.model.entity.QuestionsEntity;
import es.consumo.gescom.modules.questions.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import es.consumo.gescom.commons.db.repository.GESCOMRepository;
import es.consumo.gescom.commons.service.EntityCrudService;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class ProtocolServiceImpl extends EntityCrudService<ProtocolEntity, Long> implements ProtocolService {

    @Autowired
    private ProtocolConverter protocolConverter;

    @Autowired
    private CampaignRepository campaignRepository;

    @Autowired
    private QuestionsRepository questionsRepository;


    protected ProtocolServiceImpl(GESCOMRepository<ProtocolEntity, Long> repository) {
        super(repository);
    }

    @Autowired
    private ProtocolRepository protocolRepository;

    @Override
    public Page<ProtocolEntity> getProtocolByNameOrCode(CriteriaWrapper<ProtocolCriteria> wrapper, String protocol, String code) {
        return ((ProtocolRepository) repository).getProtocolByNameOrCode(wrapper.getCriteria().toPageable(), protocol, code);

    }

    @Override
    public Page<ProtocolEntity> findProtocolByCampaignId(CriteriaWrapper<ProtocolCriteria> wrapper, Long idCampaign) {
        return ((ProtocolRepository) repository).findProtocolByCampaignId(wrapper.getCriteria().toPageable(), idCampaign);
    }

    @Override
    public ProtocolDTO createProtocol(ProtocolDTO payload) {

        ProtocolEntity protocol = protocolConverter.convertToEntity(payload);
        protocol.setCode(payload.getCode());
        protocol.setName(payload.getName());
        CampaignEntity campaignEntity =  campaignRepository.findById(payload.getCampaignId()).orElseThrow();
        protocol.setCampaignId(campaignEntity);
        protocol.setCreatedAt(LocalDateTime.now());
        protocol.setUpdatedAt(LocalDateTime.now());
        ProtocolEntity protocolSave = protocolRepository.save(protocol);

        List<QuestionsDTO> questionsDTOS = payload.getQuestionsDTO();
        questionsDTOS.forEach(questions -> {
            QuestionsEntity questionsEntity = new QuestionsEntity();
            questionsEntity.setCode(questions.getCode());
            questionsEntity.setProtocolCampaingId(protocolSave);
            questionsEntity.setQuestion(questions.getQuestion());
            questionsEntity.setCodeInfringement(questions.getInfringement());
            questionsEntity.setBkTrnrtipp(questions.getBkTrnrtipp());
            questionsEntity.setBkTrinti(questions.getBkTrinti());
            questionsEntity.setBkTrinre(questions.getBkTrinre());
            questionsEntity.setBkTrrees(questions.getBkTrrees());
            questionsEntity.setProtocolCampaignCode(questions.getProtocolCampaignCode());
            questionsEntity.setCreatedAt(LocalDateTime.now());
            questionsEntity.setUpdatedAt(LocalDateTime.now());

            questionsRepository.save(questionsEntity);
        });

        return protocolConverter.convertToModel(protocolSave);
    }
}
