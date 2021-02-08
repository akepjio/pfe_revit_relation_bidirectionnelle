package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class Levels {
	private Integer Id;
	private Integer TypeId;
	private Integer DesignOption;
	private String Name;
	private Float Elevation;
	private String NUMERO_MODULE;
}
