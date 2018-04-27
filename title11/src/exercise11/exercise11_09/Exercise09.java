package exercise11.exercise11_09;

import java.util.*;

public class Exercise09 {
	public static void calculateClassRank(List list) {
		//먼저 반별 총점기준 내림차순으롲 정렬
		Collections.sort(list, new ClassTotalComparator());
		
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for(int i=0, n=0; i<length; i++, n++) {
			Student s = (Student)list.get(i);
			
			if(s.ban != prevBan) {
				prevBan = -1;
				prevTotal = -1;
				n = 0;
			}
			
			if(s.total == prevTotal) s.classRank = prevRank;
			else s.classRank = n + 1;
			
			prevBan = s.ban;
			prevTotal = s.total;
			prevRank = s.classRank;
		}
	}
	
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // 총점기준 내림차순으로 정렬
		
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for(int i=0; i<length; i++) {
			Student s = (Student)list.get(i);
			
			if(s.total == prevTotal) s.schoolRank = prevRank;
			else s.schoolRank = i + 1;
			
			prevRank = s.schoolRank;
			prevTotal = s.total;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		// Student(이름, 반, 번호, 국어점수, 영어점수, 수학점수)
		list.add(new Student("이자바", 2, 1, 70, 90, 70));
		list.add(new Student("안자바", 2, 2, 60, 100, 80));
		list.add(new Student("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student("김자바", 1, 2, 80, 80, 90));
		
		calculateSchoolRank(list);
		calculateClassRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
			// name, ban, no, kor, eng, math, getTotal(), getAverage(), schoolRank, classRank
			// 순으로 출력
	}

}
