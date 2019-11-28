package com.ty.collectionframework.list;

import java.util.ArrayList;

import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(23);
		al.add(98.7);
		al.add(true);
		al.add("good evening");
		
		Iterator it=al.iterator();
		System.out.println("=========================Using Iterator==========================");
		
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(o);
			
		}
		
		
		System.out.println("=========================Using Iterator==========================");
		
		
		System.out.println("====================");
		
		
		for(int i=0;i<al.size();i++)
		{
			Object o=al.get(i);
			System.out.println(o);
		}
		
		

	}

}
