package com.ty.exception.customizeUncheckedException;

public class TestAge {

	public static void main(String[] args) {
		System.out.println("Main started");
		Validator v=new Validator();
		try
		{
			v.verify(12);
		}
		catch(InvalidException e)
		{
			e.printStackTrace();
		}
		System.out.println("Main ended");

	}

}
