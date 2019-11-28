package first;

public class TestN {

	public static void main(String[] args) {
		Pen p=new Pen();
		p.cost=100;
		p.color="blue";
		p.brand="Parker smith";
		System.out.println("Cost is "+p.cost);
		System.out.println("color is "+p.color);
		System.out.println("brand is "+p.brand);
		p.write();
		System.out.println("********************************************");
		Van v=new Van();
		v.cost=500000;
		v.color="black";
		System.out.println("Van cost is "+v.cost);
		System.out.println("van color is "+v.color);
		v.move();
		Van v2=new Van();
		v2.cost=600000;
		v2.color="Red";
		System.out.println("Van2 cost is "+v2.cost);
		System.out.println("Van2 color is "+v2.color);
		v2.move();

	}

}
