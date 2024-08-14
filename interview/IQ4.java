package com.neotech.interview;

public class IQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dfg%&DF3343   ere   @#67";
		
		str = str.replaceAll("[a-zA-Z]", "");
		System.out.println(str + " "+str.length());

	}

}
