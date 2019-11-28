package com.ty.Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestE {

	public static void main(String[] args) {
		

		LinkedHashMap<String,Integer> lh=new LinkedHashMap<String,Integer>();
		lh.put("Odisha",759019);
		lh.put("Banglore", 560068);
		lh.put("Delhi", 1002);
		lh.put("Rorkee", 3456);
		for(Map.Entry<String,Integer> m: lh.entrySet())
		{
			String key=m.getKey();
			Integer value=m.getValue();
			System.out.println("Key is "+key+"---------------------"+"value "+value);
		}

	}

}
