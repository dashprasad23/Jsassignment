package first;

public class Employee2 {
	String name;
	int eid;
	long aadharno;
	Employee2(String name,int eid,long aadharno)
	{
		this.name=name;
		this.eid=eid;
		this.aadharno=aadharno;

	}
	Employee2(String name,int eid)
	{
		this.name=name;
		this.eid=eid;
	}
	Employee2(int eid,String name)
	{
		this.name=name;
		this.eid=eid;
	}
	void printDetails()
	{
		System.out.println("hi"+name+"eid"+eid+"adahar"+aadharno);
	}
	public static void main(String[] args) {
		Employee2 e1=new Employee2(111,"bhavya"); 
		e1.printDetails();
		Employee2 e2=new Employee2("divya",234);
		e2.printDetails();
		Employee2 e3=new Employee2("john",334,657489);
		e3.printDetails();
	}

}
