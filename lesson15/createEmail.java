package com.neotech.lesson15;

public class createEmail {
	String createEmail1(String firstName, String lastName, String emailType) {
		return (firstName + lastName +"@"+emailType);
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createEmail email01 = new createEmail();
		String result = email01.createEmail1("jone", "smith", "gmail.com");
		System.out.println(result);

	}

}
