package com.ty.exception.first;

public class TestB {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		int a=10;
		int b=0;
		try {
			b=a/0;
			System.out.println(b);
			System.out.println("Hellow");
			System.out.println("Happy Deepvali");
		} catch (ArithmeticException e) {
			System.out.println("number is devided by zero");
			
		}
		System.out.println(b);
		System.out.println("Main ended");
		
	}

}
