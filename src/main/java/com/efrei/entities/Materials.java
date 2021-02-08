package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class Materials {
	private Integer Id;
	private String Keynote;
	private String Name;
	private String Model;
	private String Manufacturer;
	private String Comments;
	private String URL;
	private String Description;
	private Float Cost;
	private String Mark;
	private String Grade;
	private String Species;
	private Float Thermalexpansioncoefficient;
	private Float Bending;
	private Float Shearmodulus;
	private Float Poissonratio;
	private Float Tensionperpendiculartograin;
	private Float Shearparalleltograin;
	private Float Compressionperpendiculartograin;
	private Float Compressionparalleltograin;
	private Float Youngmodulus;
	private Integer MaterialType;
	private Integer Lightweight;
	private Integer Behavior;
	private Float Resistancecalculationstrength;
	private Float Reductionfactorforshear;
	private Float Minimumtensilestrength;
	private Float Minimumyieldstress;
	private Float Shearstrengthmodification;
	private Float Shearreinforcementyieldstress;
	private Float Bendingreinforcement;
	private Float Concretecompression;
	private Float ThermalexpansioncoefficientX;
	private Float ThermalexpansioncoefficientY;
	private Float ThermalexpansioncoefficientZ;
	private Float Unitweight;
	private Float ShearmodulusX;
	private Float ShearmodulusY;
	private Float ShearmodulusZ;
	private Float PoissonratioX;
	private Float PoissonratioY;
	private Float PoissonratioZ;
	private Float YoungmodulusX;
	private Float YoungmodulusY;
	private Float YoungmodulusZ;
	private Integer Shininess;
	private Integer Smoothness;
	private Integer Glow;
	private Integer Transparency;
	private Integer Color;
	private String NUMERO_MODULE;
}
