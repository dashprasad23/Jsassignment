package first;

public class FirstGen {
	void msg()
	{
		System.out.println("msg() method");
	}
	void call()
	{
		System.out.println("call() method");
	}

}
class SecondGen extends FirstGen{
	void games()
	{
		System.out.println("games() method");
	}
}
class ThirdGen extends SecondGen
{
	void camera()
	{
		System.out.println("camera() method");
	}
}
class Testx
{
	public static void main(String[] args) {


		FirstGen f=new FirstGen();
		f.msg();
		f.call();
		System.out.println("*********************************************");
		SecondGen s=new SecondGen();
		s.msg();
		s.call();
		s.games();
		System.out.println("***********************************************8");
		ThirdGen t=new ThirdGen();
		t.call();
		t.msg();
		t.games();
		t.camera();


	}
}
