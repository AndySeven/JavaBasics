package com.syntax.class19;

public class Motocycle extends Land{
	boolean extraPassenger;
	Motocycle(String manufacturer, String color, double speed, double time, boolean cabin, boolean extraPassenger){
		super(manufacturer,color,speed,time, cabin);
		this.extraPassenger = extraPassenger;
	}
}
