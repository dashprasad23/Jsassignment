package com.ty.Maps;

import java.util.HashMap;

public class TestB {
	
	public static void main(String[] args) {
		
		
		HashMap hm=new HashMap();
		hm.put("Kuku", 998014);
		hm.put("mala",678941);
		hm.put("sheela",789789);
		System.out.println(hm);
		
		HashMap hm1=new HashMap();
		hm1.put("deepu",789099);
		hm1.put("riya", 678909);
		hm1.put("Kriti", 467787);
		
		boolean hasKey =hm.containsKey("mala");
		System.out.println("Has key "+hasKey);
		
		boolean hasValue =hm.containsValue(789789);
		System.out.println("Has value "+hasValue);
		hm.putAll(hm1);
		System.out.println(hm);
		
		System.out.println("The size of map is "+hm.size());
		System.out.println("The map is empty or not "+hm.isEmpty());
		hm.clear();
		System.out.println(hm);
		
		
	}

}
