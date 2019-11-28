package com.ty.exception.customizeCheckedException;

public class TestAmount {

	public static void main(String[] args) {
		System.out.println("Main started");
		ValidateAmount va=new ValidateAmount();
		try {
			va.checkedAmount(50000);
			System.out.println("Withdraw your cash");
		} catch (InvalidAmountException e) {
			
			System.err.println(e.getMessage());
		}
		System.out.println("Main ended");

	}

}
