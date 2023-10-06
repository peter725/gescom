package es.dgc.gesco.model.commom.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class EntityStatusChange {
    @NotNull
    @Min(1)
    private Integer status;
}
