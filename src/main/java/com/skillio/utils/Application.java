package com.skillio.utils;

public class Application {
	public static String baseDir=System.getProperty("user.dir");
	public static String filePath="/src/main/resources/application.properties";
	
	
public static String getBrowserName() {
	return FileUtility.getProperty(baseDir+filePath,"browser_name");
	}


public static String getAppUrl(String env) {
	return FileUtility.getProperty(baseDir+filePath,env+".url");
}

public static String getUserName(String env) {
		return FileUtility.getProperty(baseDir+filePath,env+".username");
}


}
