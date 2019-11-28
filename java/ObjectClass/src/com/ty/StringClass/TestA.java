package com.ty.StringClass;

public class TestA {

	public static void main(String[] args) {
	
		String s1="aishu";
		String s2="deepika";
		
		String s3= new String("aishu");
		String s4=new String("aishu");
		String s5="aishu";
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		String st=s1.toLowerCase();
		String stt=s1.toUpperCase();
		System.out.println(st);
		System.out.println(stt);
		char sd=s1.charAt(0);
		System.out.println(sd);
		String ss="Hellow";
		String ss1="hellow";
		boolean b=ss.equalsIgnoreCase(ss1);
		System.out.println(b);

	}

}
