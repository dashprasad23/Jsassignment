package com.Ty.accessmodifier.pkg1;

import com.Ty.accessmodifier.pkg2.Demo;

public class Sample {
	public static void main(String[] args) {
		Demo d=new Demo();
		Sample s=new Sample();
		/*System.out.println(d.b);
		d.sub();*/
		System.out.println(s.c);
		s.mul();
		System.out.println(d.name);
		d.div();
		
	}

}
