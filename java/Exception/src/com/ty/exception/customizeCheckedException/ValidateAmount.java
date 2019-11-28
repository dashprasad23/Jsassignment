package com.ty.exception.customizeCheckedException;

public class ValidateAmount {
	
	void checkedAmount(int amount) throws InvalidAmountException
	{
		if(amount>40000)
		{
			throw new InvalidAmountException();
		}
	}

}
