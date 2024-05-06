package com.At;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.At.base.TestBase;
import com.At.pages.HomePage;
import com.At.utilities.PropUtil;


public class TestCases extends TestBase {
	@Test
	public void verifyLastNameFieldIsRequiredOrNot1() {
		
		FluentWait<WebDriver>wait=new FluentWait<WebDriver>(Keyword.driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withMessage("Element was not operational during 60 seconds");
		wait.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Register')]")));
		Keyword.driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		String expectedErrorMsg="Last name is required.";
		Keyword.driver.findElement(By.xpath("//input[@id=\"customer.firstName\"]")).sendKeys("pooja");
		Keyword.driver.findElement(By.xpath("//input[@id=\"customer.lastName\"]")).sendKeys("Deshmukh");
		Keyword.driver.findElement(By.xpath("//input[@id=\"customer.address.street\"]")).sendKeys("pune");
		Keyword.driver.findElement(By.xpath("//input[@id=\"customer.address.city\"]")).sendKeys("pune");
		Keyword.driver.findElement(By.xpath("//input[@id=\"customer.address.state\"]")).sendKeys("Maharashtra");
		Keyword.driver.findElement(By.xpath("//input[@id=\"customer.address.zipCode\"]")).sendKeys("4122");
		Keyword.driver.findElement(By.xpath("//input[@id=\"customer.phoneNumber\"]")).sendKeys("45126972");
		Keyword.driver.findElement(By.xpath("//input[@id=\"customer.ssn\"]")).sendKeys("sdd1");
		Keyword.driver.findElement(By.xpath("//input[@id=\"customer.username\"]")).sendKeys("kjhgtyui");
		Keyword.driver.findElement(By.xpath("//input[@id=\"customer.password\"]")).sendKeys("puja123");
		Keyword.driver.findElement(By.xpath("//input[@id=\"repeatedPassword\"]")).sendKeys("puja123");
		Keyword.driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
		String errorMsg=Keyword.driver.findElement(By.xpath("//span[@id=\"customer.lastName.errors\"]")).getText();
		Assert.assertEquals(errorMsg, expectedErrorMsg);
	}
	@Test
	public void verifyLastNameFieldIsRequired()throws IOException {
		
		String expectedErrorMsg="Last name is required";
		String dir=System.getProperty("use.dir");
		String filePath=dir+"/src/test/resources/Locators.properties";
		PropUtil prop=new PropUtil(filePath);
		
		String reglink=prop.getValue("REGISTERLINK");
		Keyword.Click(reglink);
		
		
		Keyword.Click(prop.getValue("REGISTERLINK"));

		
		
		
		
	
		Keyword.enterText(Locator.FIRSTNAME,"pooja");
		Keyword.enterText(Locator.ADDRESS, "joynest apartment");
		Keyword.enterText(Locator.CITY, "pune");
		Keyword.enterText(Locator.PHONENO, "65784784");
		Keyword.enterText(Locator.ZIPCODE, "54785");
		Keyword.enterText(Locator.STATE, "Maharashtra");
		Keyword.enterText(Locator.SSN, "25Lj");
		Keyword.enterText(Locator.PASSWORD, "Atp@123");
		Keyword.enterText(Locator.REPEATEDPASSWORD, "Atp@123");
		Keyword.Click(Locator.REGISTERBTN);
		String errorMsg=Keyword.getText(Locator.LASTNAMEERROR);
		Assert.assertEquals(errorMsg, expectedErrorMsg);

		
		
		
	
			
		}
		
	@Test
	public void verifyLastNameFieldIsRequiredUsingPOM() {
		String expectedErrorMsg="Last name is required.";
		HomePage home=new HomePage();
		home.clickOnRegisterLink();
		home.enterFirstName("pooja");
		home.enterAddress("Joynest Apartment");
		home.enterCity("pune");
		home.enterZipcode("417895");
		home.enterphoneNo("24569771254");
		home.enterSSN("5684hu45");
		home.enteruserName("Testuser");
		home.enterpassword("Test@123");
		home.enterrepeatedPassword("Test@123");
		home.clickOnRegisterBtn();
		String errorMsg=home.getLastNameErrorMsg();
		
		Assert.assertEquals(errorMsg, expectedErrorMsg);
	}
	

	}
