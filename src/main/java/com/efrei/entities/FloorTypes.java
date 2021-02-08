package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class FloorTypes {
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
	private String Author;
	private String BIMObjectName;
	private String ManufacturerName;
	private String ManufacturerURL;
	private String ProductInformation;
	private String Revision;
	private String Uniclass2;
	private String Version;
	private String AcousticRating;
	private Integer Combustible;
	private String FireRating;
	private Integer IsExternal;
	private String Reference;
	private String SurfaceSpreadOfFlame;
	private String IfcExportAs;
	private String IfcExportType;
	private String AccessibilityPerformance;
	private String AssetType;
	private String Category;
	private String CodePerformance;
	private String Color;
	private String Constituents;
	private String DurationUnit;
	private String ExpectedLife;
	private String Features;
	private String Finish;
	private String Grade;
	private String Material;
	private String ModelNumber;
	private String ModelReference;
	private String Name;
	private Float NominalHeight;
	private Float NominalLength;
	private Float NominalWidth;
	private String ReplacementCost;
	private String Shape;
	private String Size;
	private String SustainabilityPerformance;
	private String WarrantyDescription;
	private String WarrantyDurationLabor;
	private String WarrantyDurationParts;
	private String WarrantyDurationUnit;
	private String WarrantyGuarantorLabor;
	private String WarrantyGuarantorParts;
	private String FlammibilityRating;
	private String FragilityRating;

}
