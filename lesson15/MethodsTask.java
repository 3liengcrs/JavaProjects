package com.neotech.lesson15;

public class MethodsTask {
	void largerNum(int a, int b) {
		if (a>b) {
			System.out.println("The larger number = " + a);
		}else {
			System.out.println("The larger number = " + b);
		}
	}
	
	
	
	void everOrOdd(int a) {
		if(a%2 == 0) {
			System.out.println("The number is : " + "Even");
		}else {
			System.out.println("The number is : " + "Odd");
		}
	}
	
	
	void sayHello(String  country) {
		switch(country) {
		case "US":
		case "UK":
			System.out.println("Hello!");
			break;
		case "Mexico":
		case "Spain":
			System.out.println("Hola!");
			break;
		case "Turkiye":
			System.out.println("Merhaba");
			break;
		default:
			System.out.println("I don't know to say hello for "+ country);
			break;
		}
	}

}
