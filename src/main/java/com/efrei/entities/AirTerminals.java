package com.efrei.entities;



import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class AirTerminals {
private Integer Id;
private Integer TypeId;
private Integer PhaseCreated;
private Integer PhaseDemolished;
private Integer DesignOption;
private String SystemClassification;
private String SystemName;
private Float Flow;
private String Comments;
private String Mark;
private String NUMERO_MODULE;

}
