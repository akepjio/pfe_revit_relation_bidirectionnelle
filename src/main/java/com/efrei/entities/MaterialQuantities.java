package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class MaterialQuantities {
	private Integer ElementId;
	private Integer MaterialId;
	private Integer AsPaint;
	private Float Area;
	private Float Volume;
}
