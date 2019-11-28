package first;

public class Employee {
	String name;
	int eid;
	public Employee(String empname,int empid)
	{
		name=empname;
		eid=empid;
	}
	void printDetails()
	{
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is"+eid);
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee("rashmika",143);
		
		Employee e2=new Employee("manasi",420);
		
		Employee e3=new Employee("Chacha",69);
		
		
		
	}

}
