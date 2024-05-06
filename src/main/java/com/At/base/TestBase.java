package com.At.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.At.Config;
import com.At.Keyword;

public class TestBase {
	public final static Keyword Keyword=new Keyword();
	@BeforeMethod
	public void setup() {
		
		Config config=new Config();
		Keyword.openBrowser(config.getBrowserName());
		Keyword.launchUrl(config.getAppurl());
		

	}
	@AfterMethod
	public void tearDown()throws Exception {
		Keyword.quitBrowser();
		
	}
}
