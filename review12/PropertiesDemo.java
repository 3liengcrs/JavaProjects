package com.neotech.review12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PropertiesDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		String filePath = projectPath + "/extra/damo1.properties";
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage()    ;
		}
		 
		System.out.println("just to check.....");

	}

}
