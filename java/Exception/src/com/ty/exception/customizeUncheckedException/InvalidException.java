package com.ty.exception.customizeUncheckedException;

public class InvalidException extends RuntimeException {
	
	String message="Invalid age below 18 years are not allowed";
	public InvalidException() {
		
	}
	public InvalidException(String message) {
		super();
		this.message = message;
	}
	
	
	@Override
	public String toString() {
		return "InvalidException [message=" + message + "]";
	}
	/*@Override
	public String getMessage()
	{
		return message;
	}*/

	
	
}
