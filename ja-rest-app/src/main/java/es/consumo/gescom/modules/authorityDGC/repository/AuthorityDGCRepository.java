package es.consumo.gescom.modules.authorityDGC.repository;

import es.consumo.gescom.modules.authorityDGC.model.entity.AuthorityDGCEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.consumo.gescom.commons.db.repository.GESCOMRepository;

@Repository
public interface AuthorityDGCRepository extends GESCOMRepository<AuthorityDGCEntity, Long> {

    @Query(value = "SELECT h FROM AuthorityDGCEntity h  where h.name = :name ")
    Page<AuthorityDGCEntity.SimpleProjection> findAllAuthorityDGCByName(
    Pageable pageable,
    @Param("name") String name);

}
