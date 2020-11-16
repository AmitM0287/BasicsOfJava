package collection_generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C_03_List_Interface {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		List values = new ArrayList();	//	Supports index number.
		
		values.add(5);
		values.add(9);
		values.add(7);
		values.add(3);
		values.add(0, 1);
		
		Iterator ite = values.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}
		
		System.out.println();
		for(Object i : values) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		for(int i=0; i<values.size(); i++) {
			System.out.print(values.get(i) + " ");
		}
		
	}

}
