package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class HVACZones {
	private Integer Id;
	private Integer DesignOption;
	private Float CalculatedAreaperCoolingLoad;
	private Float CalculatedAreaperHeatingLoad;
	private Integer UseAirChangesPerHour;
	private Integer UseOutsideAirPerArea;
	private Integer UseOutsideAirPerPerson;
	private Integer UseDehumidificationSetPoint;
	private Integer UseHumidificationSetPoint;
	private Float GrossArea;
	private Float GrossVolume;
	private Integer PhaseId;
	private Float CalculatedSupplyAirflowperarea;
	private Float CalculatedCoolingLoadperarea;
	private Float CalculatedHeatingLoadperarea;
	private Integer Level;
	private Float  OutdoorAirRate_AirChangesperHour;
	private Float  OutdoorAirperArea;
	private Float  OutdoorAirperPerson;
	private Float  DehumidificationSetPoint;
	private Float  HumidificationSetPoint;
	private Float  CoolingAirTemperature;
	private Float  HeatingAirTemperature;
	private Float  CoolingSetPoint;
	private Float  HeatingSetPoint;
	private Float  CalculatedSupplyAirflow;
	private Float  CalculatedCoolingLoad;
	private Float  CalculatedHeatingLoad;
	private Integer ServiceType;
	private Float OccupiedVolume;
	private Float Perimeter;
	private Float OccupiedArea;
	private Float CoilBypass;
	private String Name;
	private String Comments;
	private String NUMERO_MODULE;

}
