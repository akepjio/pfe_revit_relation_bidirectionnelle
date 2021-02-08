package com.efrei.entities;

import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class CurtainPanels {
	private Integer Id;
	private Integer TypeId;
	private Integer PhaseCreated;
	private Integer PhaseDemolished;
	private Integer DesignOption;
	private Float Area;
	private Integer HostId;
	private Float Width;
	private Float Height;
	private String Comments;
	private String Mark;
	private String NUMERO_MODULE;
}
