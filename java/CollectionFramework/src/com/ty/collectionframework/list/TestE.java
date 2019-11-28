package com.ty.collectionframework.list;

import java.util.LinkedList;

import java.util.*;

public abstract class TestE {

	public static void main(String[] args) {


		LinkedList li=new LinkedList();
		li.add(12);
		li.add(34.5);
		li.add("more");
		li.add(true);
		li.add(null);
		System.out.println("===================Using for Loop===========================");
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		System.out.println("=================Using iterator==============================");
		Iterator it=li.iterator();
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(o);
		}
		System.out.println("=======================Using ListIteratoe====================");
		ListIterator lt=li.listIterator();
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
