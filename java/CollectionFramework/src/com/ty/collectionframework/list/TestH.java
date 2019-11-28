package com.ty.collectionframework.list;

import java.util.*;


public class TestH {

	public static void main(String[] args) {
		System.out.println("This is Stack Collection");
		Stack v=new Stack();
		v.add(12);
		v.add("Hellow");
		v.add("22.31");
		v.add(null);
		v.add(true);
		System.out.println("===================Using for Loop===========================");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("=================Using iterator==============================");
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(o);
		}
		System.out.println("=======================Using ListIteratoe====================");
		ListIterator lt=v.listIterator();
		System.out.println("-------------------Forword------------------------>");
		while(lt.hasNext())
		{
			Object o=lt.next();
			System.out.println(o);
		}
		System.out.println("<-----------------------Backword--------------------------");
		while(lt.hasPrevious())
		{
			Object o=lt.previous();
			System.out.println(o);
		}

		

	}

}
