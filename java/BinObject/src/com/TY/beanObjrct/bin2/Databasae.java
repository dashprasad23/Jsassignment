package com.TY.beanObjrct.bin2;

import com.TY.beanObject.bin.Student;

public class Databasae {
	void receive(Employee e)
	{
		System.out.println("ID is "+e.getEid());
		System.out.println("salary is "+e.getSalary());
		System.out.println("name is "+e.getEname());
		System.out.println("department number is "+e.getDeptno());
		System.out.println("Designation is "+e.getDesignation());
		
		System.out.println("===============================================");
	}

}
