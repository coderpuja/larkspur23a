package com.At;
import org.openqa.selenium.By;

public interface Locator {
	String REGISTERLINK="//a[contains(text(),'Register')]";
	String FIRSTNAME="//input[@id='customer.firstName']";
	String ADDRESS="//input[@id='customer.address.street']";
	String CITY="//input[@id='customer.address.city']";
	String STATE="//input[@id='customer.address.state']";
	String LASTNAME="//input[@id='customer.lastName']";
	String PHONENO="//input[@id='customer.phoneNumber']";
	String USERNAME="//input[@id='customer.username']";
	String PASSWORD="//input[@id='customer.password']";
	String REPEATEDPASSWORD="//input[@id='repeatedPassword']";
	String SSN="//input[@id='customer.ssn']";
	String ZIPCODE="//input[@id='customer.address.zipCode']";
	String REGISTERBTN="//input[@value='Register']";
	String LASTNAMEERROR="//span[@id='customer.lastName.errors']";
	
 

}
