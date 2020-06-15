package com.syntax.class19;

public class Truck extends Land {
	boolean trailer;
	Truck(String manufacturer, String color, double speed, double time, boolean cabin, boolean trailer){
		super(manufacturer,color,speed,time, cabin);
		this.trailer = trailer;
	}
}