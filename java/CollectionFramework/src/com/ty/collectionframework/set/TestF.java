package com.ty.collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("Eddison");
		ts.add("Tesla");
		ts.add("Kelvin");
		ts.add("Bhimra");
		System.out.println("_________________________________Using for Each_____________________");
		for(String s:ts)
		{
			System.out.println(s);
		}
		System.out.println("____________________________Using Iterator__________________________");
		Iterator<String> i=ts.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);  
		}

	}

}
