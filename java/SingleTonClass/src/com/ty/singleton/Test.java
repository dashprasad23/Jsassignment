package com.ty.singleton;

public class Test {

	public static void main(String[] args) {
		
		MySingleTon ms=MySingleTon.getDbConnection();
		ms.s="hellow";
		System.out.println("Hashcode of ms  : "+ms.hashCode());
		MySingleTon ms1=MySingleTon.getDbConnection();
		ms1.s="hi";
		System.out.println("Hashcode of ms1 : "+ms1.hashCode());
		String st="";
	}

}
