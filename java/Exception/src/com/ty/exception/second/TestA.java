package com.ty.exception.second;

public class TestA {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
			Thread.sleep(3000);
			System.out.println("Inside try");
		} catch (InterruptedException e) {
			System.out.println("Exception cought");
			e.printStackTrace();
		}
		System.out.println("Main ended");
		
		
	}

}
