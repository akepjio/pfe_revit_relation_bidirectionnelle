package com.efrei.entities;

import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class CurtainWallMullions {
   	private Integer Id;
	private Integer TypeId;
	private Integer PhaseCreated;
	private Integer PhaseDemolished;
	private Integer DesignOption;
	private String Comments;
	private Float Length;
	private String Mark;
    private String NUMERO_MODULE;
}
