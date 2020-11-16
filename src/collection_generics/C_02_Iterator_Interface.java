 package collection_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class C_02_Iterator_Interface {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		Collection values = new ArrayList();	// Does't work with index number.
		values.add(5);
		values.add(8);
		values.add(7);
		values.add(3);
		
		Iterator ite = values.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}
