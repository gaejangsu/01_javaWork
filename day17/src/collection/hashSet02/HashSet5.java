package collection.hashSet02;

import java.util.HashSet;
import java.util.Set;

public class HashSet5 {

	public static void main(String[] args) {
		Set set = new HashSet();
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45+1);
			set.add(num);
		}
		
		System.out.println(set);
	}

}
