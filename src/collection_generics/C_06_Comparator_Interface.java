package collection_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Sort elements based on the last digit.
 * 	 Input : 404 908 639 265
 * 	Output : 404 265 908 639
 * 
 */
public class C_06_Comparator_Interface {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(908);
		values.add(639);
		values.add(265);
		
		//	In Collection there is no class which implements Comparator interface.
		//	Hence you have to create your own class.
		/**
			Comparator<Integer> c = new Comparator<Integer>(){
				public int compare(Integer i, Integer j) {
					if(i%10 > j%10) {
						return 1;
					}else {
						return -1;
					}
				}
			};
			
			Collections.sort(values, c);
		*/
		
		/**
		 	Comparator<Integer> c = (i, j) -> i%10 > j%10 ? 1 : -1;
		 	Collections.sort(values, c);
		 */
				
		Collections.sort(values, (i, j) -> i%10>j%10? 1:-1);
		for(Integer i : values) {
			System.out.print(i + " ");
		}
	}

}
