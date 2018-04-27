package exercise11.exercise11_08;

import java.util.*;

class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	int total;
	int schoolRank;
	
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
				+ getTotal() + ", " + getAverage() + ", " + schoolRank;
	}
	
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student s = (Student)o;
			return s.total - this.total;
		}
		return -1;
	}
}