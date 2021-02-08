package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class PipeSegments {
	private Integer Id;
	private Integer DesignOption;
	private String SegmentDescription;
	private String ConnectionType;
	private Float Roughness;
	private Integer Schedule_Type;
	private Integer Material;
}
