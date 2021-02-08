package com.efrei.entities;

import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class ElementPhase {
	private Integer ElementId;
	private String ElementName;
	private Integer PhaseCreatedId;
	private String PhaseName;
}
