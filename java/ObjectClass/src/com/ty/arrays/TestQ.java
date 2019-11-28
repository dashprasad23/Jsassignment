package com.ty.arrays;

public class TestQ {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"arya",78.99);
		Student s2=new Student(2,"Jems",88.99);
		Student s3=new Student(3,"Donald",65.00);
		Student s4=new Student(4,"Albert",66.89);
		Student[] std=new Student[4];
		std[0]=s1;
		std[1]=s2;
		std[2]=s3;
		std[3]=s4;
		for(Student s:std)
		{
			System.out.println(s);
		}
		System.out.println("=============================");
		receive(std);
		

	}
	static void receive(Student[] stu)
	{
		for(Student s:stu)
		{
			System.out.println(s);
		}
	}

}
