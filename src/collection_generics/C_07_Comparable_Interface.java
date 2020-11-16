package collection_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	String stName;
	int stRoll, stMarks;
	
	public Student(String stName, int stRoll, int stMarks) {
		super();
		this.stName = stName;
		this.stRoll = stRoll;
		this.stMarks = stMarks;
	}

	@Override
	public String toString() {
		return "Student [stname=" + stName + ", stRoll=" + stRoll + ", sMmarks=" + stMarks + "]";
	}

	@Override
	public int compareTo(Student st) {
		return stName.length()>st.stName.length()?1:-1;
	}
		
}
public class C_07_Comparable_Interface {

	public static void main(String[] args) {
		
		List<Student> stData = new ArrayList<>();
		stData.add(new Student("Amit Manna", 8, 86));
		stData.add(new Student("Minu Manan", 7, 91));
		stData.add(new Student("Technical Amit", 6, 95));
		stData.add(new Student("Mahasena Khatun", 5, 97));
		/**
		 * When you don't have the permission to change the class but, you want to change the logic.
		 * And you also don't need to implements comparable interface.
		 * 
		 * Collections.sort(stData, (i, j)-> i.stMarks>j.stMarks?1:-1);
		 */
		Collections.sort(stData);
		
		for(Student st : stData) {
			System.out.println(st);
		}
	}

}
