package com.At.Exceptions;

public class InvalidBrowserNameError extends Error{
	private String msg;
	public InvalidBrowserNameError(String browserName) {
		msg="Invalid browser name:"+browserName;
	
}
	@Override
	public String toString() {
		return msg;
	}

}
