package example11.list;

import java.util.ListIterator;
import java.util.Vector;

public class MyVector2Test { // p.623

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add("0");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		
		System.out.println(v);
		
		ListIterator it = v.listIterator();
		it.next();
		it.remove();
		it.next();
		it.remove();
		
		System.out.println(v);

	}

}
