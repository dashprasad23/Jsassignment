package com.ty.refrence;

public class TestA {

	public static void main(String[] args) {
		Pen p=new Marker();
		System.out.println(p.cost);
		p.write();
		Marker m= (Marker) p;
		System.out.println(m.size);
		m.color();
		m.color();
		

	}

}