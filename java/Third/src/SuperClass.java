public class SuperClass {
	public void count()
	{
		System.out.println("count() of super class");
	}
	
}
class SubClass extends SuperClass
{
	public void add()
	{
		System.out.println("add() of subclass");
	}
	public void count()
	{
		System.out.println("count() of SubClass");
	}
}
