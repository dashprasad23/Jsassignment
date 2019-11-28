package com.ty.LambdaExpression.One;

public class TestInterface {

	public static void main(String[] args) {
         
		FactInterface ft=x->{
			int fact=1;
			while(x>=1)
			{
				fact*=x;
				x--;
			}
			return fact;
		};
		int result =ft.fact(5);
		System.out.println(result);

	}

}
