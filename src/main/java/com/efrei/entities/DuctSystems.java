package com.efrei.entities;

import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class DuctSystems {
	private Integer Id;
	private Integer DesignOption;
	private Integer TypeId;
	private Integer NumberofElements;
	private String SystemEquipment;
	private String SystemName;
	private Float Flow;
	private String Comments;
	private String NUMERO_MODULE;
}
