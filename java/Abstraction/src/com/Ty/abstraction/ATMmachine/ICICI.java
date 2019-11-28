package com.Ty.abstraction.ATMmachine;

public class ICICI implements ATM {

	@Override
	public void validateCard() {
		System.out.println("icici validate card");
		
	}

	@Override
	public void getInfo() {
		System.out.println("icici get info");
		
		
	}

}
