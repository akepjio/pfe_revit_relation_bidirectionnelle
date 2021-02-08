package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class RoomFromToAssociations {
	private Integer Id;
	private Integer PhaseId;
	private Integer DesignOptionId;
	private Integer FromRoom;
	private Integer ToRoom;
}
