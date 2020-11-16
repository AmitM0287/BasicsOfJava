package collection_generics;

import java.util.ArrayList;
import java.util.List;

public class C_04_Generics {

	public static void main(String[] args) {
		
		List<Integer> val = new ArrayList<>();	//	When you are working with generics to must have to use Wrapper Class.
		val.add(5);
		val.add(7);
		val.add(9);
		val.add(4);
		
		for(Integer i : val) {
			System.out.print(i + " ");
		}
	}

}
