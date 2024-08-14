package com.neotech.lesson15;

public class PhoneStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone iphone = new Phone();   // instantiotion(create) an object from the class
		iphone.brand = "Iphone";
		iphone.color = "Blue";
		iphone.model = "15 Pro Max";
		iphone.price = 1199;
		
		iphone.call();
		iphone.navigate();
		iphone.text();
		
		 System.out.println("_________________");
		
		Phone samsung = new Phone();
		samsung.brand = "Samsung";
		samsung.color = "Black";
		samsung.model = "S24 ultra";
		samsung.price = 999;
		
		samsung.call();
		samsung.navigate();
		samsung.text();
		
System.out.println("_________________");
		
		Phone nokia = new Phone();
		nokia.brand = "Nokia";
		nokia.color = "Black";
		nokia.model = "55 11";
		nokia.price = 599;
		
		nokia.call();
		nokia.navigate();
		nokia.text();
				

	}

}
