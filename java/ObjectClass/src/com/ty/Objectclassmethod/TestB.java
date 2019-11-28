package com.ty.Objectclassmethod;

public class TestB {

	public static void main(String[] args) {
	
		Pen p=new Pen();
		int phashcode=p.hashCode();
		System.out.println("Hashcode of p "+phashcode);
		Pen p1=new Pen();
		int phashcode1=p.hashCode();
		System.out.println("Hashcode of p1 "+phashcode1);

	}

}
