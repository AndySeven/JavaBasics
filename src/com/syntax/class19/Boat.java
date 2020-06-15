package com.syntax.class19;

public class Boat extends Water{
	boolean paddles;
	Boat(String manufacturer, String color, double speed, double time, boolean paddles) {
		super(manufacturer, color, speed, time, paddles);
		this.paddles = paddles;
	}
}
