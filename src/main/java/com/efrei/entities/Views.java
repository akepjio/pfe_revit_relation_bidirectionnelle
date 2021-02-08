package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class Views {
	private Integer Id;
	private String Family;
	private String FamilyandType;
	private Integer PhaseFilter;
	private Integer PartsVisibility;
	private Integer DetailLevel;
	private Integer SunPath;
	private String DisplayName;
	private String SheetName;
	private String SheetNumber;
	private Integer Orientation;
	private String AssociatedLevel;
	private Integer Discipline;
	private Integer DisplayModel;
	private Integer ViewScale;
	private Integer ScaleValue1;
	private String TitleonSheet;
	private String ViewName;
	private Integer Phase;
	private String NUMERO_MODULE;
}
