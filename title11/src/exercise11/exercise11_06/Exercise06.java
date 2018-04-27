package exercise11.exercise11_06;

import java.util.*;

public class Exercise06 {
	static int getGroupCount(TreeSet tset, int from, int to) {
		Student s1 = new Student("", 0, 0, from, from, from);
		Student s2 = new Student("", 0, 0, to, to, to);
		return tset.subSet(s1, s2).size();
	} // #06_1 평균점수의 범위를 주면 해당 범위에 속한 학생의 수를 반환

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet set = new TreeSet(new Comparator() { // 익명클래스
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Student && o2 instanceof Student) {
					Student s1 = (Student)o1;
					Student s2 = (Student)o2;
					
					return(int)(s1.getAverage() - s2.getAverage());
				}
				return -1;
			}
		}); // #06_2 학생들의 평균을 기준으로 정렬
		
		// Student(이름, 반, 번호, 국어점수, 영어점수, 수학점수)
		set.add(new Student("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student("김자바", 1, 3, 80, 80, 90));
		set.add(new Student("이자바", 1, 4, 70, 90, 70));
		set.add(new Student("안자바", 1, 5, 60, 100, 80));
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		// 성적평균의 범위별로 학생 수를 센다
		System.out.println("[60 ~ 69] : " + getGroupCount(set, 60, 70));
		System.out.println("[70 ~ 79] : " + getGroupCount(set, 70, 80));
		System.out.println("[80 ~ 89] : " + getGroupCount(set, 80, 90));
		System.out.println("[90 ~ 100] : " + getGroupCount(set, 90, 100));
	}
}
