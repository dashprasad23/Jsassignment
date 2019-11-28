package com.ty.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestMn {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Cortena");
		al.add("Siri");
		al.add("Saraha");
		al.add("Being");
		System.out.println("Before Sort--------------------> "+al);
		Collections.sort(al);
		System.out.println("After Sort---------------------------->"+al);

	}

}
