package collection_generics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * 	Map<key, value> map = new HashMap<>();	//	(Not Synchronized)
 * 
 * 	Map<key, value> map = new Hashtable<>();	//	(Synchronized)	
 * 
 *	To achieve key value pairing we use Map Interface. 
 *
 *	HashMap and HashSet they both uses the concept of hash code.
 *	They don't give the actual sequence in which you are adding the value.
 *
 *	We can repeat the values but, we can't repeat the keys.
 *
 */
public class C_09_Map_Interface {

	public static void main(String[] args) {
		//	HashMap
		Map<String, String> map = new HashMap<>();
		map.put("Name", "Amit Manna");
		map.put("Email", "amitmanna0287");
		map.put("Dept", "ECE");
		map.put("Email", "amitmanna338");	//	Replace the previous value.
		
		System.out.println(map.get("Name"));	//	For any key if that is not present then it will print null.
		
		System.out.println();
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		
		//	Hashtable
		Map<String, String> m = new Hashtable<>(); 
		m.put("Email", "amitmanna0287");
		m.put("Email", "amitmanna338");	//	Replace the previous value.
		m.put("Dept", "ECE");
		m.put("Name", "Amit Manna");
		
		System.out.println();		
		Set<String> k = map.keySet();
		for(String key : k) {
			System.out.println(key + " : " + map.get(key));
		}
	}

}
