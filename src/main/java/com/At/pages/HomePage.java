package com.At.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.At.base.TestBase;

public class HomePage {
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	public WebElement registerLink;
	
	@FindBy(xpath = "//input[@id='customer.firstName']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@id='customer.address.street']")
	public WebElement Address;
	
	@FindBy(xpath = "//input[@id='customer.address.city']") 
	public WebElement City;
	
	@FindBy(xpath = "//input[@id='customer.address.state']")
	public WebElement State;
	
	@FindBy(xpath = "//input[@id='customer.lastName']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@id='customer.phoneNumber']")
	public WebElement phoneNo;
	
	@FindBy(xpath = "//input[@id='customer.username']")
	public WebElement userName;
	
	@FindBy(xpath = "//input[@id='customer.password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='repeatedPassword']")
	public WebElement repeatedPassword;
	
	@FindBy(xpath = "//input[@id='customer.ssn']")
	public WebElement ssn;
	
	@FindBy(xpath = "//input[@id='customer.address.zipCode']")
	public WebElement zipcode;
	
	@FindBy(xpath = "//input[@value='Register']")
	public WebElement registerBtn;
	
	@FindBy(xpath = "//span[@id='customer.lastName.errors']")
	public WebElement lastNameError;
	
	public HomePage() {
		PageFactory.initElements(TestBase.Keyword.driver, this);
	}

	
	public void clickOnRegisterLink() {
		registerLink.click();
	}

	
	public void enterFirstName(String text) {
		firstName.sendKeys(text);
	}
	public void enterAddress(String text) {
		Address.sendKeys(text);
	}
	public void enterCity(String text) {
		City.sendKeys(text);
	}
	public void enterZipcode(String text) {
		zipcode.sendKeys(text);
	}


	public void enterphoneNo(String text) {
		phoneNo.sendKeys(text);
	}


	public void enterSSN(String text) {
		
		ssn.sendKeys(text);
	}


	public void enteruserName(String text) {
		userName.sendKeys(text);
		
	}


	public void enterpassword(String text) {
		
		password.sendKeys(text);
	}


	public void enterrepeatedPassword(String text) {
		
		repeatedPassword.sendKeys(text);
	}


	public void enterregisterBtn(String text) {
		
		registerBtn.sendKeys(text);
	}


	public void clickOnRegisterBtn() {
		registerBtn.click();
		
	}


	public String getLastNameErrorMsg() {
		return lastNameError.getText();
		
	}










}

