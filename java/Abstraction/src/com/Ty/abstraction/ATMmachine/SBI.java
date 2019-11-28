package com.Ty.abstraction.ATMmachine;

public class SBI implements ATM {

	@Override
	public void validateCard() {
		System.out.println("sbi validate card");
		
	}

	@Override
	public void getInfo() {
		System.out.println("sbi get info");
		
	}
	

}
