package collection.linkedList01;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(Integer.valueOf(10));
		list.add(8);
		list.add(20);
		list.add(3);
		
		for(int i : list) {
			System.out.print(i + " ");
			System.out.println();
		}
		
		System.out.println();
		
		// 삭제
		list.remove(1);
		for(int i : list) {
			System.out.print(i + " ");
			System.out.println();
		}
		
		System.out.println();
		
		list.remove(); // 맨 앞을 삭제
		for(int i : list) {
			System.out.print(i + " ");
			System.out.println();
		}
		
		System.out.println();
		
		list.removeFirst(); // 맨 앞을 삭제
		for(int i : list) {
			System.out.print(i + " ");
			System.out.println();
		}
		
		list.removeLast(); // 맨 끝 삭제
		for(int i : list) {
			System.out.print(i + " ");
			System.out.println();
		}
		
		
		/*
		LinkedList<Student> stuList = new LinkedList<Student>();
		stuList.add(new Student("홍길동",23));
		stuList.add(new Student("아무개",23));
		
		for(Student i : stuList) {
			System.out.println(i + " ");
			System.out.println();
		}
		*/
		
	}

}