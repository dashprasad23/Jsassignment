package com.ty.exception.customizeUncheckedException;

public class Validator {
	
	void verify(int age)
	{
		if(age<18)
		{
			throw new InvalidException("try again next time!!");
		}
	}

}
