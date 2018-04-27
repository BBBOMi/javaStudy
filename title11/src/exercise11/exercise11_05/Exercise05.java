package exercise11.exercise11_05;

import java.util.*;

public class Exercise05 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		// Student(이름, 반, 번호, 국어점수, 영어점수, 수학점수)
		list.add(new Student("홍길동", 1, 1, 100, 100, 100));
		list.add(new Student("남궁성", 1, 2, 90, 70, 80));
		list.add(new Student("김자바", 1, 3, 80, 80, 90));
		list.add(new Student("이자바", 1, 4, 70, 90, 70));
		list.add(new Student("안자바", 1, 5, 60, 100, 80));
		
		Collections.sort(list); // list에 저장된 요소들을 정렬한다.(compareTo() 호출)
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}

}
