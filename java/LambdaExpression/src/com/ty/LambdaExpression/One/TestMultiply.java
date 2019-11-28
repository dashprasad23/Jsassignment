package com.ty.LambdaExpression.One;

public class TestMultiply {

	public static void main(String[] args) {
		
		MultiplyInterface multiply=(a,b)->a*b;
		int product=multiply.multiply(10, 20);
		System.out.println("Product is "+product);
		

	}

}
