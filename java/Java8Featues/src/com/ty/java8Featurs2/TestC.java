package com.ty.java8Featurs2;

import java.util.function.Function;

public class TestC {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f=i-> i*i;
		int res=f.apply(30);
		System.out.println("Square root of 30 is "+res);
		
		int result =f.apply(4);
		System.out.println("Squere root of 4 is "+result);
		

	}

}
