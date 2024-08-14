package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fullPah = "C:\\Users\\3li\\Desktop\\JavaProject\\JavaProject\\configs\\conf.properties";
		// this part of the path is not exist in the pc
		String userDirectroy = System.getProperty("user.dir");
		System.out.println(userDirectroy);
		
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		
		
		String dynamicPath = System.getProperty("user.dir")+"/configs/conf.properties";
		System.out.println(dynamicPath);
		
		FileInputStream fis =  new FileInputStream(dynamicPath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		
		String url = prop.getProperty("url");
		System.out.println(url);
		

	}

}
