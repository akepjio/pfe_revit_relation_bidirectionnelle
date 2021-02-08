package com.efrei.entities;

import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class DuctSystemTypes {
	private Integer Id;
	private Integer Rise_DropSymbol;
	private String Abbreviation;
	private String SystemClassification;
	private String TypeComments;
	private String URL;
	private String Description;
}
