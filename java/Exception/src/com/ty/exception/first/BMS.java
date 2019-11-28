package com.ty.exception.first;

public class BMS {

	public static void main(String[] args) {
		
		System.out.println("bms Started");
		
		PVR p=new PVR();
		try
		{
			p.book();
			System.out.println("Booking conformed");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("booking failed");
		}
		System.out.println("bms ended");

	}

}
