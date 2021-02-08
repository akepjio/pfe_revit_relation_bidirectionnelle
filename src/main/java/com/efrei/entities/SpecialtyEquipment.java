package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class SpecialtyEquipment {
private Integer Id;
private Integer TypeId;
private Integer PhaseCreated;
private Integer PhaseDemolished;
private Integer DesignOption;
private String Panel;
private String CircuitNumber;
private String Comments;
private Integer HostId;
private Integer Level;
private String Mark;
private String NUMERO_MODULE;
}
