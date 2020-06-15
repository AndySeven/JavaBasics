package com.syntax.class09;

public class ClockVasya {

	public static void main(String[] args) {
		for (int h = 0; h < 24; h++) {// hours
			for (int m = 0; m < 60; m++) {// minutes
				for (int s = 0; s < 60; s++) {// seconds
					if (m < 10 && s < 10) {
						System.out.println(h + ":0" + m + ":0" + s);
					} else if (m >= 10 && s < 10) {
						System.out.println(h + ":" + m + ":0" + s);
					} else if (m < 10 && s >= 10) {
						System.out.println(h + ":0" + m + ":" + s);

					}
				}
			}
		}
	}

}
