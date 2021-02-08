package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class Roofs {
    private Integer Id;
private Integer TypeId;
private Integer PhaseCreated;
private Integer PhaseDemolished;
private Integer DesignOption;
private Float Volume;
private Float Area;
private String Comments;
private Integer RafterorTruss;
private Float FasciaDepth;
private Integer RafterCut;
private Integer BaseLevel;
private Float CutoffOffset;
private Integer CutoffLevel;
private Float BaseOffsetFromLevel;
private String Mark;
private String NUMERO_MODULE;
}
