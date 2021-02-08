package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class RampTypes {
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
}
