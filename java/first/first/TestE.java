package first;

public class TestE {
	public static void main(String[] args) {
		Student.cname="Qspider";
		Student s1=new Student();
		s1.name="priya";
		s1.USN=101;
		System.out.println("Collage name is"+Student.cname);
		System.out.println("Name is:"+s1.name);
		System.out.println("ID is "+s1.USN);
	}

}
