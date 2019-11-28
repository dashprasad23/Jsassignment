package Com.ty.sorting.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList<Marker> al=new ArrayList<>();
		al.add(new Marker(50,"blue"));
		al.add(new Marker(70,"blue"));
		al.add(new Marker(80,"red"));
		al.add(new Marker(40,"green"));
		
		System.out.println("Before sorting");
		display(al);
		System.out.println("-------------------------------------------");
		System.out.println("After sorting");
		StoreByPrice s=new StoreByPrice();
		Collections.sort(al,s);
		display(al);
		System.out.println("------------------------------------------");
		System.out.println("sorting by color");
		StoreByColor st2=new StoreByColor();
		Collections.sort(al,st2);
		display(al);
		
		
		

	}
	static void display(ArrayList<Marker> ar)
	{
		Iterator<Marker> it=ar.iterator();
		while(it.hasNext())
		{
			Marker m=it.next();
			System.out.println("Price is "+m.price);
			System.out.println("Color is "+m.color);
		}
	}

}
