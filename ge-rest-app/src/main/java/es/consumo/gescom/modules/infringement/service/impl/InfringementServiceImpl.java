package es.consumo.gescom.modules.infringement.service.impl;

import es.consumo.gescom.commons.db.repository.GESCOMRepository;
import es.consumo.gescom.commons.dto.wrapper.CriteriaWrapper;
import es.consumo.gescom.commons.service.EntityCrudService;
import es.consumo.gescom.modules.infringement.model.criteria.InfringementCriteria;
import es.consumo.gescom.modules.infringement.model.entity.InfringementEntity;
import es.consumo.gescom.modules.infringement.repository.InfringementRepository;
import es.consumo.gescom.modules.infringement.service.InfringementService;
import es.consumo.gescom.modules.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


@Service
public class InfringementServiceImpl extends EntityCrudService<InfringementEntity, Long> implements InfringementService {
    protected InfringementServiceImpl(GESCOMRepository<InfringementEntity, Long> repository) {
        super(repository);
    }

    @Autowired
    private InfringementRepository campaignTypeRepository;

    public Page<InfringementEntity.SimpleProjection> findAllInfringementEntityById(CriteriaWrapper<InfringementCriteria> wrapper, Long id) {
        return ((InfringementRepository) repository).findAllInfringementEntityById(wrapper.getCriteria().toPageable(), id);
    }

    @Override
    public Page<InfringementEntity.SimpleProjection> findAllSimpleEntity(CriteriaWrapper<InfringementCriteria> wrapper) {
        return ((InfringementRepository) repository).findAllByCriteria(wrapper.getCriteria(), wrapper.getCriteria().toPageable());

    }
}

