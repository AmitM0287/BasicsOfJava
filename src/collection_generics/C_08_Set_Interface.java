package collection_generics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C_08_Set_Interface {

	public static void main(String[] args) {
		
		Set<Integer> val = new HashSet<>();	// It's does't support duplicate elements.
		val.add(87);					   	// HashSet --> Sequence is not getting maintains.
		val.add(97);
		val.add(34);
		val.add(92);
		
		for(Integer k : val) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		Set<Integer> v = new TreeSet<>();	// It's does't support duplicate elements.
		v.add(87);					    	// TreeSet --> Sequence is getting maintains in ascending order.
		v.add(97);
		v.add(34);
		v.add(92);
		
		for(Integer k : v) {
			System.out.print(k + " ");
		}
	}

}
