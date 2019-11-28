package com.ty.LambdaExpression.One;

public class TestSayHi {

	public static void main(String[] args) {
		
		SayHiInterface sh=()->System.out.println("hi");
		System.out.println(sh);
	}

}
