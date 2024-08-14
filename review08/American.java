package com.neotech.review08;

public class American extends Human{
	public American(String name) {
		
		super(name);
	}
	@Override
	public void talk() {
		System.out.println("I can speak English....");
		
	}
	public void palyNBA() {
		System.out.println("can plays NBA");
	}

}
