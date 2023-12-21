package es.dgc.gesco.model.modules.CampaignType.dto.criteria;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import es.dgc.gesco.model.commom.dto.FilterCriteria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
public class CampaignTypeCriteria extends FilterCriteria {

    private Long id;
}