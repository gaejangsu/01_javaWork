package collection.hashSet02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("HTML");
		set.add("JSP");
		set.add("java");
		set.add("ORACLE");
		System.out.println("size : " + set.size());
		System.out.println(set);
		set.remove("HTML");
		set.remove("ORACLE");
		System.out.println("size : " + set.size());
		System.out.println(set);
		
		Iterator<String> iterator = set.iterator();
		iteratorPrint(iterator);
	
		
	}
	
	static void iteratorPrint(Iterator<String> i) {
		while(i.hasNext()) {
			System.out.print(i.next() + ", ");
		}
		System.out.println();
	}
	

}