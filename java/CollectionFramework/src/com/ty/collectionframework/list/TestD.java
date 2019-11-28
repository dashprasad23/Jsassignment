package com.ty.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(45.6);
		al.add("Yash");
		al.add(true);
		ListIterator li=al.listIterator();
		System.out.println("-----------------Forword-------------------------->");
		while(li.hasNext())
		{
			Object ab=li.next();
			System.out.println(ab);
		}
		System.out.println("<-----------------------------Backword-----------------------");
		while(li.hasPrevious())
		{
			Object o=li.previous();
			System.out.println(o);
		}
		String st=(String)al.get(2);
		

	}

}
