
public class SuperClass {

	String s="super class variable";
	SuperClass()
	{
		System.out.println("Super class constructor");
	}
	
}
class SubClass extends SuperClass
{
	String s="sub class variable";
	SubClass()
	{
		super();
		System.out.println("sub class constructor");
	}
	void getSData()
	{
		System.out.println(s);
		System.out.println(this.s);
		
	}
}
