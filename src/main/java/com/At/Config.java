package com.At;

import java.io.IOException;

import com.At.utilities.PropUtil;

public class Config {
	public String getBrowserName() {
	
	return readProperty("browser_name");
}
	public String getAppurl() {
		return readProperty("app_url");

	}

	 public String getUsername() {
		 return readProperty("username");
	}

	private String readProperty(String property) {
		String baseDir=System.getProperty("user.dir");
		PropUtil prop=new PropUtil(baseDir+"/src/main/resources/Config.properties");
		String browserName=null;
		try {
			browserName=prop.getValue("browserName");
		} catch (IOException e) {
			
		}
		return browserName;
	}
	}
		
	