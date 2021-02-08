package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class PipingSystemTypes {
	private Integer Id;
	private String Abbreviation;
	private String Description;
	private Float FluidDensity;
	private Float FluidTemperature;
	private Integer FluidType;
	private Float FluidDynamicViscosity;
	private Integer SingleLineDropSymbol;
	private Integer SingleLineRiseSymbol;
	private Integer SingleLineTeeDownSymbol;
	private Integer SingleLineTeeUpSymbol;
	private String SystemClassification;
	private Integer TwoLineDropSymbol;
	private Integer TwoLineRiseSymbol;
	private String TypeComments;
	private String URL;
}
