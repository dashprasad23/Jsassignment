package com.ty.refrence;

public class Marker extends Pen {
	double size;
	void color()
	{
		System.out.println("Marker color() method");
	}
	@Override
	void write()
	{
		System.out.println("Marker() write method");
	}

}
