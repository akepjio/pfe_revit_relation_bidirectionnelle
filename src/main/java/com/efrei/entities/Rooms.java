package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class Rooms {
	private Integer Id;
	private Integer DesignOption;
	private Integer PhaseId;
	private String Comments;
	private Float Volume;
	private Float Perimeter;
	private Integer Level;
	private String Occupancy;
	private String Department;
	private String BaseFinish;
	private String CeilingFinish;
	private String WallFinish;
	private String FloorFinish;
	private Float Area;
	private String Number;
	private String Name;
	private Float UnboundedHeight;
	private String Occupant;
	private String ZONE;
	private String NUMERO_MODULE;
	private String BATIMENT;
}
