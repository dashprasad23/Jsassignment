package first;

public class Empt {
	public static void main(String[] args) {
		Bus b=new Bus();
		b.getDetails();
		Bus b2=new Bus(50);
		b2.getDetails();
		Bus b3=new Bus(60,"blue");
		b3.getDetails();
	}

}
