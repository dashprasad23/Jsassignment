package com.ty.hasarelation.week;

public class TestA {
	public static void main(String[] args) {
		
		Person p=new Person();
		System.out.println(p.name);
		p.sleep();
		p.eat();
		System.out.println("================");
		p.m.write();
	}

}
