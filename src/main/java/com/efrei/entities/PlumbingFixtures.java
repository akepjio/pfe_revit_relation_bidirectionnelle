package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class PlumbingFixtures {
	private Integer Id;
	private Integer TypeId;
	private Integer PhaseCreated;
	private Integer PhaseDemolished;
	private Integer DesignOption;
	private String SystemClassification;
	private String SystemName;
	private String Trap;
	private String Drain;
	private String SupplyPipe;
	private String SupplyFitting;
	private String Comments;
	private Integer Level;
	private String Mark;
	private String NUMERO_MODULE;
}
