package com.ty.objectclassEquals;

public class TestG {

	public static void main(String[] args) {
		
		Cow c=new Cow(10,"ganga",10000);
		Cow c1=new Cow(11,"manga",20000);
		Cow c2=new Cow(10,"ganga",10000);
		Cow c3=c2;
		System.out.println(c.equals(c1));
		System.out.println(c1.equals(c2));
		System.out.println(c.equals(c2));
		System.out.println(c3.equals(c2));
		System.out.println(c3.equals(c));

	}

}
