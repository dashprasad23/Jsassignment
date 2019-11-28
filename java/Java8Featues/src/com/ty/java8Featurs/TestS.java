package com.ty.java8Featurs;

import java.util.ArrayList;

public class TestS {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(5,"Vikram",56.7));
		al.add(new Student(3,"Vijay",27.8));
		al.add(new Student(6,"Yash",30.7));
		al.add(new Student(2,"akashya",65.8));
		al.add(new Student(1,"aishu",90.99));
		Helper h=new Helper();
		//h.displayAllStudent(al);
		//h.displayFailedStudent(al);
		//h.displayPassedStudent(al);
		h.topperStudent(al);

	}

}
