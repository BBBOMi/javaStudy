package exercise11.exercise11_08;

import java.util.*;

public class Exercise08 {
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다
		
		int prevRank = -1; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();
		
		for(int i=0; i<length; i++) {
			Student s = (Student)list.get(i);

			if(s.total == prevTotal)
				s.schoolRank = prevRank; // 동점자 처리
			else
				s.schoolRank = i + 1;

			prevRank = s.schoolRank;
			prevTotal = s.total;
		}
	} // #08_2 총점을 기준으로 각 학생의 전교등수 계산

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
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
			// name, ban, no, kor, eng, math, getTotal(), getAverage(), schoolRank
			// 순으로 출력

	}

}
