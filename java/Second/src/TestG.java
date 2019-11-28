
public class TestG {
	final void add()
	{
		System.out.println("final() method");
	}
	final void add(int a)
	{
		System.out.println("add(int a) method");
	}
	public static void main(String[] args)
	{
		TestG sup=new TestG();
		sup.add();
		sup.add(20);
	}

}
