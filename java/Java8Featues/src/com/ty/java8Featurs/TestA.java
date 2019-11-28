package com.ty.java8Featurs;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
		
		Predicate<Integer> p=i ->{
			if(i%2==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		boolean pt=p.test(21);
		System.out.println("Result "+pt);

	}

}
