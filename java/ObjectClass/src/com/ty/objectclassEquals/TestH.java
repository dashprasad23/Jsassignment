package com.ty.objectclassEquals;

public class TestH {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1122,"John",50000);
		Employee e2=new Employee(1322,"Donald",50000);
		Employee e3=new Employee(1122,"John",50000);
		Employee e4=e2;

		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e1.equals(e3));
		System.out.println(e4.equals(e2));
		String e11=e1.toString();
		String e22=e2.toString();
		String e33=e3.toString();
		System.out.println(e11);
		System.out.println(e22);
		System.out.println(e33);

	}

}
