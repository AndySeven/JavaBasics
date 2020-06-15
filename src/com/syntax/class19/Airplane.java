package com.syntax.class19;

public class Airplane extends Air {
	boolean passenger;
	Airplane(String manufacturer, String color, double speed, double time, boolean passenger){
		super(manufacturer,color,speed,time, passenger);
		this.passenger = passenger;
	}
}
