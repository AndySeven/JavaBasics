package com.syntax.class19;

public class Air extends Transport {
boolean waterLanding;
Air(String manufacturer, String color, double speed, double time, boolean waterLanding){
	super(manufacturer,color,speed,time);
	this.waterLanding = waterLanding;
}
}