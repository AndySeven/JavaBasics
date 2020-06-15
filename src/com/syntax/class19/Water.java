package com.syntax.class19;

public class Water extends Transport {
boolean antiStorm;
	Water(String manufacturer, String color, double speed, double time, boolean antiStorm) {
		super(manufacturer, color, speed, time);
		this.antiStorm = antiStorm;
	}
}
