package com.efrei.entities;



import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class Walls {
	private Integer Id;
	private Integer TypeId;
	private Integer PhaseCreated;
	private Integer PhaseDemolished;
	private Integer DesignOption;
	private Float EstimatedReinforcementVolume;
	private Float Volume;
	private Float Area;
	private String Comments;
	private Float Length;
	private String Mark;
	private Integer StructuralUsage;
	private Float TopOffset;
	private Float BaseOffset;
	private Integer BaseConstraint;
	private Float UnconnectedHeight;
	private Integer TopConstraint;
	private Integer RoomBounding;
	private String LOT;
	private String NUMERO_MODULE;
    
    //public List<String> attributsSystemes;
}
