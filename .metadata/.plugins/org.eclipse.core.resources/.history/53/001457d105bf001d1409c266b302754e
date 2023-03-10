package collection.hashSet02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class HashSet3 {

	public static void main(String[] args) {

		Set<Person> set = new HashSet<Person>();
		set.add(new Person("홍길동", 20));
		set.add(new Person("홍길동", 20));
		
		System.out.println("size : " + set.size());
		iteratorPrint(set.iterator());
		System.out.println();;
		
	}
	
	static void iteratorPrint(Iterator<Person> i) {
		while(i.hasNext()) {
			// System.out.print(i.next() + ", ");
			Person p = i.next();
			System.out.print(p.getName() + ", ");
			System.out.print(p.getAge() + "\t");
		}
		System.out.println();
	}

}