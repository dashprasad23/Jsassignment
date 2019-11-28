package com.TY.beanObjrct.bin2;

public class TestB {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEid(123);
		e.setSalary(50000);
		e.setEname("John");
		e.setDeptno(2234);
		e.setDesignation(" 'Java Devloper' ");
		Databasae db1=new Databasae();
		db1.receive(e);
		

	}

}
