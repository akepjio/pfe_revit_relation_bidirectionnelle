package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class StructuralColumns {
	private Integer Id;
	private Integer TypeId;
	private Integer PhaseCreated;
	private Integer PhaseDemolished;
	private Integer DesignOption;
	private Float EstimatedReinforcementVolume;
	private Float Volume;
	private String Comments;
	private Float TopOffset;
	private Float BaseOffset;
	private Integer TopLevel;
	private Integer BaseLevel;
	private Integer AnalyzeAs;
	private Float Length;
	private String Mark;
	private String LOT;
	private String NUMERO_MODULE;
}
