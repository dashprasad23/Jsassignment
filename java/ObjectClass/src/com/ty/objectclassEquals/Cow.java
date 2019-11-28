package com.ty.objectclassEquals;

public class Cow {
	int id;
	String name;
	double cost;
	public Cow(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public boolean equals(Object ab)
	{
		Cow c=(Cow )ab;
		if(this==ab)
		{
			return true;
		}
		else
		{
			if(this.id==c.id)
			{
				if(this.name.equals(c.name))
				{
					if(this.cost==c.cost)
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
	}
	

}
