package com.ty.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<>();
		
		hs.add("vijay");
		hs.add("ajay");
		hs.add("Sujay");
		hs.add("drijay");
		hs.add("enjoy");
		System.out.println("***********************Using For Each*****************************");
		for(Object o:hs)
		{
			System.out.println(o);
		}
		System.out.println("****************************Using Iterator*****************************");
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(o);
		}
		
	}

}
