package first;

public class SuperClass {
	SuperClass()
	{
		System.out.println("Super class constructor");
	}

}
class SubClass extends SuperClass
{
	String s="subClass variable";
	SubClass()
	{
	  super();
	  System.out.println("sub class constructor");
	}
	void getsData()
	{
		System.out.println(s);
		System.out.println(this.s);
	}
}
class TestAb
{
	public static void main(String[] args) {
		SuperClass sup=new SuperClass();
		System.out.println("***********************************");
		SubClass sub=new SubClass();
	}
}
