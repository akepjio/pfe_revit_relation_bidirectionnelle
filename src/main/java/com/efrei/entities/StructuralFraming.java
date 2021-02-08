package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class StructuralFraming {
	private Integer Id;
	private Integer TypeId;
	private Integer PhaseCreated;
	private Integer PhaseDemolished;
	private Integer DesignOption;
	private Float EstimatedReinforcementVolume;
	private Float Volume;
	private String Comments;
	private Integer Level;
	private Float  CutLength;
	private Integer ReferenceLevel;
	private Integer StructuralUsage;
	private Float Length;
	private String Mark;
	private String NUMERO_MODULE;
}
