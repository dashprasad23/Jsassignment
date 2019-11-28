package com.ty.Typecasting;

public class TestA {
	public static void main(String[] args) {
		byte a=10;
		int b=a;
		System.out.println("b is "+b);
		int p=20;
		double q=p;
		System.out.println("q is "+q);
		System.out.println("=====================================");
		double x=20.67;
		int y=(int)x;
		System.out.println(x);
		System.out.println(y);
		byte z=(byte)x;
		System.out.println(z);
		char r=(char)x;
		System.out.println(r);
	}

}
