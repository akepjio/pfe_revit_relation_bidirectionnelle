package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class Grids {
	private Integer Id;
	private Integer TypeId;
	private String Name;
	private Integer ScopeBox;
	private String NUMERO_MODULE;
}
