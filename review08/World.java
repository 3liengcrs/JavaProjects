package com.neotech.review08;

public class World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human.planet = "Earth";
		
		Human h1 = new Human();
		System.out.println(h1.name + " lives on "+ Human.planet);
		
		Human h2= new Human("jackline");
		System.out.println(h2.name + " lives on "+ Human.planet);
		Human h3 = new American("Jack");
		h3.talk();
		American h4 = (American)h3;
		h4.palyNBA();

	}

}
