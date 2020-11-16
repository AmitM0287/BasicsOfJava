package collection_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
  	Collection is an Interface. We can't create the object of an Interface.
  	
  	 Iterable(I) <-- Collection(I) <-- List(I) <-- ArrayList(C).
  
  	For Collection size is not fixed you can shrink it and also can expand it.
  
  	If the number of element is fixed then always go for array as arrays are faster than Collection.
  
  	Collection<Integer> value = new ArrayList<Integer>(); 	1.2
  	Class <Generics> value = new Class <Generics> ();		1.5
  	
  	Collection<Integer> value = new ArrayList<>();			1.7 & above
  	
  	Collection does't work with index numbers.
  	
  	In order to work with index numbers we instead of working with Collection we use List.
  	
  	In List you can have duplicate values.
  	List maintain sequence. The order in which you will getting the element is fixed.
  	
  	 Iterable(I) <-- Collection(I) <-- Set(I) <-- HashSet(C) / <-- TreeSet(C)
  	
  	In Set you can't have duplicate values.
  	Every element in set will be unique.
  	Set does't maintain sequence. The order in which you will getting the element is random.
  	
  	The advantage to use TreeSet is it will gives you everything in sorted format.
  	
  	 Map(I) <-- HashMap(C) / <-- Hashtable(C)
  	
  	Map is a key value relationship.
  	Map<key, value>. For every value you have a unique key there.
  	For every value you have a key. It can be a integer, string, anything.
  	
  	Map<key, value> m = new HashMap<>();
  	
  	Map<key, value> map = new Hashtable<>();
  	
 */

public class C_01_CollectionGenerics {

	public static void main(String[] args) {
		Collection<Integer> value = new ArrayList<>();	//	Does't work with index numbers.
		value.add(5);
		value.add(7);
		
		List<Integer> val = new ArrayList<>();	// Work with index numbers. 
		val.add(0, 8);
		val.add(1, 9);
		
		Set<Integer> nums = new HashSet<>();	//	Unsorted format.
		nums.add(4);

		Set<Integer> num = new TreeSet<>();		//	Sorted format.
		num.add(9);
		num.add(2);
		num.add(7);
		num.add(5);
		
		Map<Integer, String> m = new HashMap<>();
		m.put(28, "Amit");
		m.put(7, "Minu");
		
		Map<Integer, String> map = new Hashtable<>();
		map.put(1, "Hello");
		map.put(2, "Test");
		
		
	}

}
