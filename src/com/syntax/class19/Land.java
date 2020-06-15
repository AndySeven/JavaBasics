package com.syntax.class19;

public class Land extends Transport{
	boolean cabin;
		Land(String manufacturer, String color, double speed, double time, boolean cabin){
			super(manufacturer,color,speed,time);
			this.cabin = cabin;
	}
}
