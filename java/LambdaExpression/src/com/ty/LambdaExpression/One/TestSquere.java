package com.ty.LambdaExpression.One;

public class TestSquere {

	public static void main(String[] args) {
		
		SquereInterface sq=x->x*x;
		int res=sq.squere(10);
		System.out.println(res);

	}

}
