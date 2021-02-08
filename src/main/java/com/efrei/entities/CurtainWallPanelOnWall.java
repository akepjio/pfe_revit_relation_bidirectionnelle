package com.efrei.entities;

import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class CurtainWallPanelOnWall {
	private Integer Id;
	private String Name;
	private Integer HostId;
	private String HostName;
}
