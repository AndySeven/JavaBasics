package com.syntax.class19;

public class Car extends Land {
	boolean sportMode;
	Car(String manufacturer, String color, double speed, double time, boolean cabin, boolean sportMode){
		super(manufacturer,color,speed,time, cabin);
		this.sportMode = sportMode;
	}
}