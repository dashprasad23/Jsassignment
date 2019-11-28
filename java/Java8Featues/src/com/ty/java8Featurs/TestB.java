package com.ty.java8Featurs;

import java.util.function.Predicate;

public class TestB {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"anup",45.6);
		Predicate<Student> p=s->
		{
			if(s.percentage>35)
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		boolean b=p.test(s1);
		System.out.println("The student is passed "+b);

	}

}
