package com.ty.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestC {
	public static void main(String[] args) {
		
		Comparator<Employee> cmp=(e1,e2)->
		{
		  return e1.name.compareTo(e2.name);
		};
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee e1=new Employee(1,"veeru");
		Employee e2=new Employee(2,"yuvi");
		Employee e3=new Employee(3,"dhoni");
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		List<Employee> li=al.stream().sorted(cmp).collect(Collectors.toList());
		
		Iterator<Employee> i=li.iterator();
		while(i.hasNext())
		{
			Employee em=i.next();
			System.out.println("Id is "+em.id);
			System.out.println("Name is "+em.name);
		}
	}

}
