package com.ty.exception.first;

public class TestG {

	public static void main(String[] args) {
	
		System.out.println("Main Started");
		PayTM p=new PayTM();
		
		try
		{
			p.book();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception cought in main");
		}
		finally
		{
			System.out.println("executing finally");
		}
		System.out.println("Main ended");
		

	}

}


























