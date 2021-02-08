package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class Sheets {
	private Integer Id;
	private String Assembly_Keynote;
	private String Assembly_AssemblyDescription;
	private Float Assembly_Cost;
	private String Assembly_TypeMark;
	private String Assembly_AssemblyCode;
	private String Assembly_Description;
	private String Assembly_URL;
	private String Assembly_TypeComments;
	private String Assembly_Manufacturer;
	private String Assembly_Model;
	private String Assembly_Name;
	private Integer GuideGrid;
	private Integer CurrentRevisionIssued;
	private String CurrentRevisionIssuedBy;
	private String CurrentRevisionIssuedTo;
	private String CurrentRevisionDate;
	private String CurrentRevisionDescription;
	private String CurrentRevision;
	private String FilePath;
	private String ApprovedBy;
	private String DesignedBy;
	private Integer AppearsInSheetList;
	private String CheckedBy;
	private String DrawnBy;
	private String Scale;
	private String SheetNumber;
	private String SheetName;
	private String SheetIssueDate;
	private String Dependency;
	private String ReferencingDetail;
	private String ReferencingSheet;
	private Integer LeftClipActive;
	private String NUMERO_MODULE;
}
