package com.neotech.lesson15;

public class Phone {
//	attributes
	String color,brand,model;
	int price;
	// behaviors
	// call, text, navigate
	void call() {
		System.out.println(brand + " can make calls");
	}
	void text() {
		System.out.println(brand + " can send text");
	}
	void navigate() {
		System.out.println(brand + " can be used as a GPS device");
	}



}
