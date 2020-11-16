package collection_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C_05_Collections_Class {

	public static void main(String[] args) {
		
		List<Integer> val = new ArrayList<>();	// List is by default mutable.
		val.add(5);
		val.add(7);
		val.add(9);
		val.add(4);
		val.add(8);
		val.add(2);
		
		Collections.sort(val);
		for(Integer i : val) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		Collections.reverse(val);
		for(Integer i : val) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		Collections.shuffle(val);	// Gives you random values.
		for(Integer i : val) {
			System.out.print(i + " ");
		}
	}

}
