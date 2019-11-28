package com.ty.exception.first;

public class TestC {

	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		int[] a= {10,20,30};
		int b=10;
		
		try {
			System.out.println(b/0);
			System.out.println(a[4]);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number devided by zero");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("array index not present");
		}
		System.out.println("Main ends");

	}

}
