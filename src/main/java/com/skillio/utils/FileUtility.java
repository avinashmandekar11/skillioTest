package com.skillio.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	/**
	 * give me a key and i will return locator from locator.properties file 
	 */
	public static String getLocator(String loactorKey) {
		String baseDir = System.getProperty("user.dir");
		return getProperty(baseDir+"/src/test/resources/locators.properties", loactorKey);
		
//		String baseDir=System.getProperty("user.dir");
//		FileInputStream fis = null;  
//		try {
//			fis = new FileInputStream(baseDir+"/src/test/resources/locators.properties");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Properties prop = new Properties();
//		try {
//			prop.load(fis);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String value=prop.getProperty("city_name");
//		System.out.println(value);
//		return value;
		
		
		
		
	}
	
	
	public static String getProperty(String filePath,String Key) {
		FileInputStream fis = null;  
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value=prop.getProperty(Key);
		System.out.println("Value"+value);
		return value;
		
		
	}
	
	
	
public static void main(String[] args) throws IOException {
//	String baseDir=System.getProperty("user.dir");
//	FileInputStream fis = new FileInputStream(baseDir+"/src/test/resources/locators.properties");
//	Properties prop = new Properties();
//	prop.load(fis);
//	String value=prop.getProperty("city_name");
//	System.out.println(value);
//	
	
	
}
}
