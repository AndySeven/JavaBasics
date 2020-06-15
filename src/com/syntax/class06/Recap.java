package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
//		// if hour between 1-11 - morning
//						12-15 - afternoon
//						16-20 - evening
//						21-24 - night
		
		int hour = 19;
		String timeOfDay;
		
		if (hour >= 1 && hour <= 11) {
			timeOfDay = "morning";
		}else if (hour >= 12 && hour <= 15) {
			timeOfDay = "morning";
		}else if (hour >= 16 && hour <= 20) {
			timeOfDay = "morning";
		}else if (hour >= 21 && hour <= 24) {
			timeOfDay = "morning";
		}else {
			timeOfDay = "unknown";
		}
		if(!timeOfDay.equals("unknown")) {
		System.out.println(timeOfDay);
		
		}
	}		
}
