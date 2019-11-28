package com.ty.Maps;

import java.util.Map;
import java.util.TreeMap;

public class ClassF {

	public static void main(String[] args) {
		
		TreeMap<String,Integer> lh=new TreeMap<String,Integer>();
		lh.put("Odisha",759019);
		lh.put("Banglore", 560068);
		lh.put("Delhi", 1002);
		lh.put("Rorkee", 3456);
		
		for(Map.Entry<String,Integer> m:lh.entrySet())
		{
			String Key=m.getKey();
			Integer value=m.getValue();
			System.out.println("Key is "+Key);
			System.out.println("Value is "+value);
			System.out.println("==========================================");
			
			
		}

	}

}
