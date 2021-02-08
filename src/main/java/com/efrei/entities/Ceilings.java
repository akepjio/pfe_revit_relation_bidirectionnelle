package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class Ceilings {
	private Integer Id;
	private Integer TypeId;
	private Integer PhaseCreated;
	private Integer PhaseDemolished;
	private Integer DesignOption;
	private Float Volume;
	private Float Area;
	private String Comments;
	private Float HeightOffsetFromLevel;
	private Integer Level;
	private Float Perimeter;
	private String Mark;
	private String NUMERO_MODULE;
}
