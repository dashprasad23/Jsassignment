package first;
class TestR
{
	int fact=1;
	public void rec(int num)
	{
		
		if(num!=0)
		{
			fact*=num;
			num--;
			rec(num);
		}
		else
		{
			System.out.println("the factorial is "+fact);
		}
		
	}
}

public class Recursn {

	public static void main(String[] args) {
	    TestR t=new TestR();
	    t.rec(10);

	}

}
