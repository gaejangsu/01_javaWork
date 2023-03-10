package collection.treeSet03;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(Integer.valueOf(89));
		scores.add(100);
		scores.add(45);
		scores.add(91);
		scores.add(75);
		System.out.println(scores);
		System.out.println(scores.first());
		System.out.println(scores.last());
		System.out.println("91점보다 바로 낮은 점수 : " + scores.lower(91));
		System.out.println("91점보다 바로 위의 점수 : " + scores.higher(91));
		System.out.println("89점과 같거나 보다 바로 낮은 점수 : " + scores.floor(89));
		System.out.println("90점과 같거나 보다 바로 낮은 점수 : " + scores.floor(90));
		
		System.out.println("89점과 같거나 보다 바로 윗 점수 : " + scores.ceiling(89));
		System.out.println("90점과 같거나 보다 바로 윗 점수 : " + scores.ceiling(90));
		
	}

}