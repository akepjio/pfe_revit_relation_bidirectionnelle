package com.efrei.entities;

import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class DoorWall {
	private Integer DoorId;
	private String DoorName;
	private Integer WallId;
	private String WallName;
}
