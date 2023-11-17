package es.dgc.gesco.service.facade;

import es.dgc.gesco.model.modules.CampaignType.db.entity.CampaingnType;
import es.dgc.gesco.model.modules.approach.db.entity.Approach;
import es.dgc.gesco.model.modules.approach.dto.ApproachDto;
import es.dgc.gesco.service.service.ApproachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class ApproachFacade {

    @Autowired
    private ApproachService approachService;


    public Approach saveApproach(final Approach approach){
        Approach newApproach = approachService.saveApproach(approach);

        return newApproach;
    }

    public List<Approach> findAll() {
        List<Approach> approaches = approachService.findAllApproach();
        return approaches;
    }

    public ApproachDto getUserById(final Long id){
        Approach approach = approachService.getApproachById(id);
        ApproachDto approachDto = new ApproachDto();
        approachDto = approachService.loadApproachDto(approach);

        if(approach.getCampaignTypeId() != null && !approach.getCampaignTypeId().getType().isEmpty()){
            String campaingnType = approach.getCampaignTypeId().getType();
            approachDto.setCampaignType(campaingnType);
        }
        return approachDto;
    }

    public Approach loadApproach(ApproachDto approachDto) {
        Approach approach = approachService.loadApproach(approachDto);
        return approach;
    }
}