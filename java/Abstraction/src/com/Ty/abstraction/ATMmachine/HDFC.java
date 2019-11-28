package com.Ty.abstraction.ATMmachine;

public class HDFC implements ATM{

	@Override
	public void validateCard()
	{
		System.out.println("hdfc validate card");
		
	}

	@Override
	public void getInfo() 
	{
		System.out.println("hdfc get info");
		
	}

}
