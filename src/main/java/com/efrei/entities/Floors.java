package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class Floors {
	private Integer Id;
	private Integer TypeId;
	private Integer PhaseCreated;
	private Integer PhaseDemolished;
	private Integer DesignOption;
	private Float EstimatedReinforcementVolume;
	private Float Volume;
	private Float Area;
	private String Comments;
	private Integer Level;
	private Integer Structural;
	private Float Perimeter;
	private Float HeightOffsetFromLevel;
	private Integer AnalyzeAs;
	private String Mark;
	private String LOT;
	private String NUMERO_MODUL;
}
