package com.ty.collectionframework.list;

import java.util.*;

public class TestF {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("anupama");
		al.add("Divya");
		al.add("momo");
		String st=al.get(0);
		System.out.println(st);
		Iterator<String> it=al.iterator();
		while(it.hasNext())
		{
			String st1=it.next();
			System.out.println(st1);
		}
		System.out.println("===================Using ListIterator=================");
		ListIterator<String> lt=al.listIterator();
		System.out.println("--------------------Forword--------------------------------------->");
		while(lt.hasNext())
		{
			String st2=lt.next();
			System.out.println(st2);
		}
		System.out.println("<----------------------------Backword-----------------------------");
		while(lt.hasPrevious())
		{
			String st3=lt.previous();
			System.out.println(st3);
		}

	}

}
