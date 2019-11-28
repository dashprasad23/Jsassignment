package com.ty.java8Featurs2;

import java.util.function.Consumer;
import com.ty.java8Featurs.Student;

public class TestF {

	public static void main(String[] args) {
		
		Consumer<Student> c=s->{
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("===================================");
		};
		Student s2=new Student(23,"Donald",23.45);
		c.accept(s2);
	}

}
