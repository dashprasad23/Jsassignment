package first;

public class TestO {
	void TestO()
	{
		System.out.println("TestC constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("main started");
		TestO t=new TestO();
		t.TestO();
		
		System.out.println("main ended");
	}

}
