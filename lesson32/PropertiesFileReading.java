package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// locating the file 
		String filePath = "C:/Users/3li/Desktop/JavaProject/JavaProject/configs/example.properties";
		
		// Am I reading or writing -- FileInputStream
		FileInputStream fis = new FileInputStream(filePath);
		
		// this next steps are specific to .properties file type
		// create a property object
		
		Properties prop = new Properties();
		
		// load the data in the properties
		
		prop.load(fis);
		
		// lets read the data
		
		String name = prop.getProperty("name");
		System.out.println("name -> "+ name);
		String lastName = prop.getProperty("lastName");
		System.out.println("name -> "+ lastName);
		
		
		Set<Object> Keys = prop.keySet();
		Collection<Object> values = prop.values();
		 for (Object key : Keys) {
			 System.out.println(key);
		 }
		for (Object val : values) {
			System.out.println(val);
			
		}

	}

}
