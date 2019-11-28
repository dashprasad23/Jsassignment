package com.ty.java8Featurs2;

import java.util.function.Predicate;



public class TestA {
	
	public static void main(String[] args) {
		
		Age a=new Age("Albert",23);
		
		Predicate<Age> p=s->{
			if(s.age>18)
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		boolean b=p.test(a);
		System.out.println("The person is eligible for vote "+b);
	}


}
