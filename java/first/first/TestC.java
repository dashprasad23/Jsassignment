package first;

public class TestC {

	public static void main(String[] args) {
		Person.color="white";
		Person.sleep();
		System.out.println("person color "+Person.color);
		Person p=new Person();
		p.age=23;
		p.name="Stalin";
		System.out.println("Person age is "+p.age);
		System.out.println("person name is "+p.name);
		Person.sleep();

	}

}
