package com.neotech.review06;

public class person {
	// instance variable
	public String name;
	int age;
	protected int weight;
	public person(String Nm,int Ag, int wgt) {
		name = Nm;
		age = Ag;
		weight = wgt;
	}
	
	
	
	public void displayInfo() {
		System.out.println("Name: " + name + " Age: " + age + " weight: "+ weight);
	}

}
