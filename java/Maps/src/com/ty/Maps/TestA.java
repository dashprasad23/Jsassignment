package com.ty.Maps;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put("Kuku", 998014);
		hm.put("mala",678941);
		hm.put("sheela",789789);
		System.out.println("Data"+hm);
		hm.put("mala", 989899);
		System.out.println("After modify"+hm);
		hm.put("Divya",989899);
		System.out.println("After Divya"+hm);
		hm.put(null, 1234);
		hm.put(null, 123433);
		System.out.println("After modification"+hm);
		System.out.println(hm.get("sheela"));

	}

}
