package com.syntax.class19;

public class Ship extends Water{
	boolean cruise;
	Ship(String manufacturer, String color, double speed, double time, boolean cruise) {
		super(manufacturer, color, speed, time, cruise);
		this.cruise = cruise;
	}
}
