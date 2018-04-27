package exercise11.exercise11_09;

import java.util.*;

class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	int total;
	int schoolRank; // 전교등수
	int classRank; // 반등수
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no= no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor + eng + math;
	}
	
	int getTotal() {
		return total;
	}
	
	float getAverage() {
		return (int)((getTotal() / 3f) * 10 +0.5) / 10f;
	}
	
	public String toString() {
		return name + ", " + ban + ", " + no + ", "
				+ kor + ", " + eng + ", " + math + ", "
				+ getTotal() + ", " + getAverage() + ", " + schoolRank + ", " + classRank;
	}
	
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student s = (Student)o;
			return s.total - this.total;
		}
		return -1;
	}
}

class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			
			//if(s1.ban == s2.ban) return s2.total - s1.total; // 총점(total) 기준 정렬(내림차순)
			//return s1.ban - s2.ban; // 반(ban) 기준 정렬(오름차순)
			int result = s1.ban - s2.ban;
			
			if(result == 0) result = s2.total - s1.total;
			return result;
		}
		return -1;
	}
}
