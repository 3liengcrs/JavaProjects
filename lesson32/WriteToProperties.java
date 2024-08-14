package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class WriteToProperties {


		// TODO Auto-generated method stub
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
			prop.setProperty("state", "NY");
			
			prop.setProperty("city", "NYC");
//			String name = prop.getProperty("name");
//			System.out.println("name -> "+ name);
//			String lastName = prop.getProperty("lastName");
//			System.out.println("name -> "+ lastName);
			FileOutputStream fos = new FileOutputStream(filePath);
			
//			Set<Object> Keys = prop.keySet();
//			Collection<Object> values = prop.values();
//			 for (Object key : Keys) {
//				 System.out.println(key);
//			 }
//			
			prop.store(fos, "We just updated the file");
			System.out.println();
			
			Set<Object> Keys = prop.keySet();
			Collection<Object> values = prop.values();
			 for (Object key : Keys) {
				 System.out.println(key + "----->" +prop.get(key));
			 }
			
			

	}

}
