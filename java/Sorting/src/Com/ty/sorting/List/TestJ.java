package Com.ty.sorting.List;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	public static void main(String[] args) {
		
		Comparator<Employee> cmp=(e1,e2)->{
			
			if(e1.height>e2.height)
			{
				return 1;
			}
			else if(e1.height<e2.height)
			{
				return -1;
			}
			else
			{
				return 0;
			}
			
		};
		
		TreeSet<Employee> ts=new TreeSet<>(cmp);
		Employee e1=new Employee(4,"niki",5.6);
		Employee e2=new Employee(1,"baskr",5.2);
		Employee e3=new Employee(5,"Suresh",5.1);
		Employee e4=new Employee(2,"dinesh",4.5);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("*************************Using iterator******************************");
		Iterator<Employee> it=ts.iterator();
		while(it.hasNext())
		{
			Employee e=it.next();
			System.out.println("Name is "+e.name);
			System.out.println("ID is "+e.id);
			System.out.println("Height is "+e.height);
			System.out.println("=========================================");
		}

	}

}
