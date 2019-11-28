package com.ty.collectionframework.list;

public class TestK {

	public static void main(String[] args) {
		
		EmployeeObject[] employee=new EmployeeObject[5];
		EmployeeObject e1=new EmployeeObject(15589,"john","Devloper");
		EmployeeObject e2=new EmployeeObject(15588,"Albert","Tester");
		EmployeeObject e3=new EmployeeObject(15587,"Stalin","HR");
		EmployeeObject e4=new EmployeeObject(15586,"Donald","Clerck");
		EmployeeObject e5=new EmployeeObject(15582,"Evanka","CEO");
		employee[0]=e1;
		employee[1]=e2;
		employee[2]=e3;
		employee[3]=e4;
		employee[4]=e5;
		System.out.println("====================For Loop================================");
		for(int i=0;i<employee.length;i++)
		{
			System.out.println(employee[i]);
		}
		System.out.println("==========================Foreach Loop======================");
		
		for(EmployeeObject e:employee)
		{
			System.out.println(e);
		}
		
		
		
		
		

	}

}
