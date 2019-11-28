package first;

public class TestB {

	public static void main(String[] args) {
		Cow c=new Cow();
		c.name="Manga";
		c.color="white";
		c.eat();
		c.sleep();
		System.out.println("cow name is "+c.name);
		System.out.println("Cow color is"+c.color);
		System.out.println("*******************************************");
		Cow c2=new Cow();
		c2.name="Manga2";
		c2.color="Brown";
		c2.eat();
		c2.sleep();
		System.out.println("cow name is "+c2.name);
		System.out.println("Cow color is"+c2.color);
		

	}

}
