package example11.set;

import java.util.*;

public class HashSetEx3 { // p. 634

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		// �� Person��ü�� �ٸ� ��ü
		// ���� �� ��ü ��� �����
		
		System.out.println(set);

	}
}

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}
}
