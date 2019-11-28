package com.ty.exception.first;

public class PayTM {

	void book()
	{
		System.out.println("PayTM started");
		
		IRCTC i=new IRCTC();
		i.conform();
		System.out.println("PayTM ended");
	}
}
