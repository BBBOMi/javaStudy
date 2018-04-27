package exercise11.exercise11_07;

import java.util.*;

class Student {
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no= no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)((getTotal() / 3f) * 10 +0.5) / 10f;
	}
	
	public String toString() {
		return name + ", " + ban + ", " + no + ", "
				+ kor + ", " + eng + ", " + math + ", "
				+ getTotal() + ", " + getAverage();
	}
}

class BanNoAscending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			
			if(s1.ban == s2.ban) return s1.no - s2.no;
			return s1.ban - s2.ban;
			// return s1.ban == s2.ban ? s1.no - s2.no : s1.ban - s2.ban; (���׿����� �̿�)
		}
		return -1;
	}
} // #07 ArrayList�� ��� Student�ν��Ͻ����� ��(ban)�� ��ȣ(no)�� �������� ���ĵǰ� ��
	// ���� ���� ��� ��ȣ�� ���ؼ� ����

