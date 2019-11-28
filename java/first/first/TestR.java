package first;

public class TestR {
	int x;
	public static void add()
	{
		int a;
		int b;
		a=10;
		b=20;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		add();
		TestR t=new TestR();
		System.out.println("x value is"+t.x);
	}

}
