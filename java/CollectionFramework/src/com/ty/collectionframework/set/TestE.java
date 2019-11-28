package com.ty.collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(12);
		ts.add(9);
		ts.add(39);
		/*
		 Tree dos't allow any null and duplicate value
		 => the data type of all variable must be same otherwise it will give class cast Exception
		 =>the element of hash set by default store in a sorted order
		 */
		

		
		System.out.println("____________________________Using For each_______________________________");
		for(Object s:ts)
		{
			System.out.println(s);
		}
		System.out.println("___________________________________Using Iterator_________________________________");
		Iterator i=ts.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}
		

	}

}
