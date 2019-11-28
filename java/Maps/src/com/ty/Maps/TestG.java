package com.ty.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {
		
		
		
		Employee e1=new Employee(1123,"Donald",23000);
		Employee e2=new Employee(1124,"Kevin",32000);
		Employee e3=new Employee(1125,"Edward",36000);
		Employee e4=new Employee(1126,"Anthony",22000);
		Employee e5=new Employee(1127,"Json",15000);
		Employee e6=new Employee(1128,"Gary",18000);
		Employee e7=new Employee(1129,"Frank",21000);
		Employee e8=new Employee(1130,"Scott",52000);
		Employee e9=new Employee(1131,"Eric",41000);
		Employee e10=new Employee(1132,"Andrew",12000);
		
		ArrayList<Employee> ar1=new ArrayList<>();
		ar1.add(e1);
		ar1.add(e2);
		ar1.add(e3);
		ar1.add(e4);
		ArrayList<Employee> ar2=new ArrayList<>();
		ar2.add(e5);
		ar2.add(e6);
		ar2.add(e7);
		ArrayList<Employee> ar3=new ArrayList<>();
		ar3.add(e8);
		ar3.add(e9);
		ar3.add(e10);
		HashMap<String,ArrayList<Employee>> hm=new HashMap<>();
		hm.put("Manager1", ar1);
		hm.put("Manager2", ar2);
		hm.put("Manager3", ar3);
		
		ArrayList<Employee> first=hm.get("Manager1");
		
		Iterator<Employee> it=first.iterator();
		System.out.println("MANAGER 1");
		System.out.println("---------------------------");
		while(it.hasNext())
		{
			Employee e=it.next();
			System.out.println("Employee name "+e.name);
			System.out.println("Employee id"+e.id);
			System.out.println("Employee salary "+e.Salary);
			System.out.println("_________________________________");
		}
ArrayList<Employee> first2=hm.get("Manager2");
		
		Iterator<Employee> it1=first2.iterator();
		System.out.println("MANAGER 2");
		System.out.println("---------------------------");
		while(it1.hasNext())
		{
			Employee e=it1.next();
			System.out.println("Employee name "+e.name);
			System.out.println("Employee id"+e.id);
			System.out.println("Employee salary "+e.Salary);
			System.out.println("_________________________________");
		}
ArrayList<Employee> first3=hm.get("Manager3");
		
		Iterator<Employee> it3=first.iterator();
		System.out.println("MANAGER 3");
		System.out.println("---------------------------");
		while(it3.hasNext())
		{
			Employee e=it3.next();
			System.out.println("Employee name "+e.name);
			System.out.println("Employee id"+e.id);
			System.out.println("Employee salary "+e.Salary);
			System.out.println("_________________________________");
		}
		
		
		
		
		
		
		

	}

}
