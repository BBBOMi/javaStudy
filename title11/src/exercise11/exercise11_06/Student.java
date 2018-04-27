package exercise11.exercise11_06;

class Student implements Comparable {
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
	
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student s = (Student)o;
			
			return name.compareTo(s.name); // String클래스의 compareTo() 호출
		}
		
		return -1;
	}
}
