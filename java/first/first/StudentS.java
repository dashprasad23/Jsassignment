package first;

public class StudentS {
	public String name;
	public int SID;
	public int age;
	public long Phno;
	public double percentage;
	StudentS( String name,int SID,int age,long Phno,double perc)
	{
		this.name=name;
		this.SID=SID;
		this.age=age;
		this.Phno=Phno;
		percentage=perc;
		this.details();
		System.out.println("***************************************************");

	}
	public void details()
	{
		System.out.println("Student name is "+name);
		System.out.println("Student ID is "+SID);
		System.out.println("Student age is "+age);
		System.out.println("Student Phno is "+Phno);
		System.out.println("Student percentage is "+percentage);
	}



	public static void main(String[] args) {

		StudentS s1=new StudentS("Scott",15589,18,754083,69.09);
		StudentS s2=new StudentS("Donald",15588,19,754083,82.00);
		StudentS s3=new StudentS("John",15587,17,754083,75.00);
		StudentS s4=new StudentS("Thomas",15586,15,754083,49.0);
		StudentS s5=new StudentS("Robert",15580,20,754083,62.0);
		StudentS s6=new StudentS("Albert",15579,21,754083,89.09);
		StudentS s7=new StudentS("Robert",15569,19,754083,99.09);
		StudentS s8=new StudentS("Jems",15549,18,754083,59.09);
		StudentS s9=new StudentS("Parker",15539,17,754083,81.09);
		StudentS s10=new StudentS("ema",15559,16,754083,79.09);



	}

}
