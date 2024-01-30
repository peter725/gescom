package es.consumo.gescom.modules.autonomousCommunityParticipants.service;

import es.consumo.gescom.commons.service.CrudService;
import es.consumo.gescom.modules.autonomousCommunityParticipants.model.dto.AutonomousCommunityParticipantsDTO;
import es.consumo.gescom.modules.autonomousCommunityParticipants.model.entity.AutonomousCommunityParticipantsEntity;

import java.util.List;

public interface AutonomousCommunityParticipantsService extends CrudService<AutonomousCommunityParticipantsEntity, Long>{

    List<AutonomousCommunityParticipantsDTO> findByIdCampaign(Long idCampaign);
}
