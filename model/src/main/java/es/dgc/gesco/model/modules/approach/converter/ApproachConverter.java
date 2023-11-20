package es.dgc.gesco.model.modules.approach.converter;

import es.dgc.gesco.model.modules.approach.db.entity.Approach;
import es.dgc.gesco.model.modules.approach.dto.ApproachDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ApproachConverter {

    final public ApproachConverter INSTANCE = Mappers.getMapper(ApproachConverter.class);

    Approach convertDtoToUsuer(ApproachDto approachDto);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "date", source = "date")
    @Mapping(target = "autonomousCommunityId", source = "autonomousCommunityId")
    ApproachDto convertApproachToDto(Approach approach);
}