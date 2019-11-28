package com.ty.Objectclassmethod;

public class TestF {

	public static void main(String[] args) {
		
		Car c=new Car(15000000,"BMW","Black");
		int chs=c.hashCode();
		System.out.println(chs);
        System.out.println(c);
        
	}

}
