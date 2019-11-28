package com.ty.Maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> lh=new LinkedHashMap<String,Integer>();
		lh.put("Odisha",759019);
		lh.put("Banglore", 560068);
		lh.put("Delhi", 1002);
		lh.put("Rorkee", 3456);
		System.out.println(lh);
		
		Set<String> s=lh.keySet();
		for(String key:s)
		{
			System.out.println("key "+key);
		}
		System.out.println("=========================================");
		
		Collection<Integer> c=lh.values();
		for(Integer value:c)
		{
			System.out.println("Value "+value);
		}
		System.out.println("==============================================");

	}

}
