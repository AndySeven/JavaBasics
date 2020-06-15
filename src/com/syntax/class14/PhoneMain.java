package com.syntax.class14;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone phone1 = new Phone();
		phone1.model = "iPhone";
		phone1.color = "Silver";
		phone1.oS = "iOS";
		phone1.price = 1000;
		
		Phone phone2 = new Phone();
		phone2.model = "Samsung";
		phone2.color = "Blue";
		phone2.oS = "Android";
		phone2.price = 800;
		
		Phone phone3 = new Phone();
		phone3.model = "Nokia";
		phone3.color = "Blue";
		phone3.oS = "Symbian";
		phone3.price = 300;		
		
		phone1.makePhoto();
		phone1.makeVideo();
		
		phone2.makePhoto();
		phone2.makeVideo();
		phone3.makePhoto();
		phone3.makeVideo();
		
		
		

	}

}
