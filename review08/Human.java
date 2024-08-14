package com.neotech.review08;

public class Human {
	String name;
	static String planet;
	public Human() {
		System.out.println("A human is being created..");
	}
	public Human(String name) {
		this();
		this.name = name;
	}
	public void talk() {
		System.out.println("Bla bla bla bla....");
	}

}
