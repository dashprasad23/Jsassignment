package com.ty.java8Featurs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	
	void displayAllStudent(ArrayList<Student> al)
	{
		Iterator<Student> it=al.iterator();
		while(it.hasNext())
		{
			Student s=it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("=====================================================");
		}
	}
	void displayFailedStudent(ArrayList<Student> al)
	{
		List<Student> l=al.stream().filter(student  ->student.percentage<35).collect(Collectors.toList());
		
		Iterator<Student> it=l.iterator();
		System.out.println("Failed Students are");
		System.out.println("-------------------------------------------");
		while(it.hasNext())
		{
			Student s=it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("=====================================================");
		}
	}
	void displayPassedStudent(ArrayList<Student> al)
	{
		List<Student> l=al.stream().filter(student  ->student.percentage>35).collect(Collectors.toList());
		
		Iterator<Student> it=l.iterator();
		System.out.println("Passed Students are");
		System.out.println("-------------------------------------------");
		System.out.println("");
		while(it.hasNext())
		{
			Student s=it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("=====================================================");
		}
	}
	void topperStudent(ArrayList<Student> al)
	{
		
		
		Comparator<Student> cmp=(s1,s2)->
		{
			if(s1.percentage>s2.percentage)
			{
				return 1;
			}
			else if(s1.percentage<s2.percentage)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		};
		Student l=al.stream().filter(student  ->student.percentage>35).max(cmp).get();
		System.out.println("The topper student is "+l.name);
		
		
	}

}
