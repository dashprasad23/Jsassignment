package com.ty.java8Featurs2;

import java.util.function.Function;

import com.ty.java8Featurs.Student;

public class TestD {

	public static void main(String[] args) {
		
		Function<Integer,Student> f=id->{
			Student s=new Student(2,"vijay",56.78);
			s.id=id;
			return s;
		};
		Student s=f.apply(27);
		System.out.println("Id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Percentage is "+s.percentage);

	}

}