package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class GridTypes {
	private Integer Id;
	private String TypeName;
	private Integer Symbol;
	private Integer CenterSegment;
	private Integer CenterSegmentPattern;
	private Integer CenterSegmentColor;
	private Integer CenterSegmentWeight;
	private Float EndSegmentsLength;
	private Integer EndSegmentPattern;
	private Integer EndSegmentColor;
	private Integer EndSegmentWeight;
	private Integer PlanViewSymbolsEnd1_Default;
	private Integer PlanViewSymbolsEnd2_Default;
	private Integer Non_PlanViewSymbols_Default;
}
