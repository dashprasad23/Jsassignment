package Com.ty.sorting.List;

import java.util.LinkedList;

public class TestC {

	public static void main(String[] args) {
		
		LinkedList<Integer> l=new LinkedList<>();
		l.add(12);
		l.add(23);
		l.add(34);
		l.add(25);
		Integer peekElement=l.peek();
		System.out.println("Peek element "+peekElement);
		Integer peekElementFirst=l.peekFirst();
		System.out.println("Peek element first "+peekElementFirst);
		Integer peekElementLst=l.peekLast();
		System.out.println("Peek last element "+peekElementLst);
		System.out.println("After peek------------------->"+l);
		
		System.out.println("**************************************************************************");
		
		Integer pollElement=l.peek();
		System.out.println("Poll element "+pollElement);
		Integer pollElementFirst=l.pollFirst();
		System.out.println("Poll element first "+pollElementFirst);
		Integer pollElementLst=l.peekLast();
		System.out.println("Poll last element "+pollElementLst);
		System.out.println("After poll------------------->"+l);
		
		l.push(12);
		System.out.println("After push------------->"+l);
		Integer p=l.pop();
		System.out.println(p);
		System.out.println("After pop-------------------->"+l);
	}

}
