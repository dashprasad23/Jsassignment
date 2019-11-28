package Com.ty.sorting.List;

import java.util.Comparator;

public class StoreByColor implements Comparator<Marker> {

	@Override
	public int compare(Marker m1, Marker m2) {
	
		String st=m1.color;
		String st2=m2.color;
		return st.compareToIgnoreCase(st2);
		
	}

}
