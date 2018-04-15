package exercise06;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("ȫ�浿", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());

	}

}

/*class Student {
	String name;
	int ban, no;
	int kor, eng, math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		float result = this.getTotal() / 3.0f + 0.05f;
		result = (float)((int)(result * 10) * 0.1); 
		return result;
	}
	
	String info() {
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ","
				+ this.getTotal() +", " + this.getAverage();
	}
	
}*/

