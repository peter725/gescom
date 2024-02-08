package es.consumo.gescom.modules.users.service;

import es.consumo.gescom.modules.campaignProposal.model.dto.CampaignProposalDTO;
import es.consumo.gescom.modules.users.model.entity.UserEntity;
import es.consumo.gescom.modules.users.model.criteria.UserCriteria;
import es.consumo.gescom.modules.users.model.dto.UserDTO;
import es.consumo.gescom.commons.dto.wrapper.CriteriaWrapper;
import es.consumo.gescom.commons.service.CrudService;
import org.springframework.data.domain.Page;

public interface UserService extends CrudService<UserEntity, Long> {

    Page<UserEntity.SimpleProjection> findAllSimpleEntity(CriteriaWrapper<UserCriteria> wrapper);

    Page<UserDTO> findAllUsers(CriteriaWrapper<?> criteriaWrapper);

    UserDTO findByUserId(Long id);

    UserEntity create(UserDTO userDTO);

    UserEntity update(UserDTO userDTO);
}
