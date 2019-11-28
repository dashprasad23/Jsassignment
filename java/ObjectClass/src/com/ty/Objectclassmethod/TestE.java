package com.ty.Objectclassmethod;

public class TestE {

	public static void main(String[] args) {
		Student b=new Student(10,"ranga",67.09);
	int b1=	b.hashcode();
	System.out.println(b1);
	String s=b.toString();
	System.out.println(s);
	System.out.println(b);

	}

}
