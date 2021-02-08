package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class WireTypes {
	private Integer Id;
	private String Keynote;
	private String Model;
	private String Manufacturer;
	private String TypeComments;
	private String URL;
	private String Description;
	private String OmniClassNumber;
	private String AssemblyCode;
	private String FamilyName;
	private String TypeName;
	private String TypeMark;
	private Float Cost;
	private Integer ShareNeutralConductor;
	private Integer ShareGroundConductor;
	private Integer Material;
	private Integer TemperatureRating;
	private Integer Insulation;
	private String MaxSize;
	private Float NeutralMultiplier;
	private Integer NeutralIncludedinBalancedLoad;
	private Integer NeutralSize;
	private String ConduitType;
}
