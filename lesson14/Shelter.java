package com.neotech.lesson14;

public class Shelter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog dog1 = new dog();
		dog1.breed = "Golden Retriever";
		dog1.size = "Medium";
		dog1.color = "Black";
		dog1.age = 3;
		
		
		dog dog2 = new dog();
		dog2.breed = "Greyhound";
		dog2.size = "Small";
		dog2.color = "Brown";
		dog2.age = 4;
		  
		
		dog dog3 = new dog();
		dog3.breed = "German Shepherd";
		dog3.size = "Large";
		dog3.color = "Brown";
		dog3.age = 1;
		
		
		
		dog1.eat();
		dog1.breed();
		dog1.run();
		
		dog2.eat();
		dog2.breed();
		dog2.run();
		
		dog3.eat();
		dog3.breed();
		dog3.run();
		
	}

}
