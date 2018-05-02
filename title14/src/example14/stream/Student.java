package example14.stream;

public class Student implements Comparable<Student>{
	String name;
	int ban;
	int totalScore;
	
	boolean isMale; // ����
	int hak; // �г�
	
	Student(String name, boolean isMale, int hak, int ban, int totalScore) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return String.format("[%s, %s, %d�г�, %d��, %3d��]", name, isMale ? "��" : "��" , hak, ban, totalScore).toString();
	}
	
	// groupingBy()���� ���
	enum Level { HIGH, MID, LOW } // ������ ��, ��, �� �� �ܰ�� �з�
	
	String getName() { return name; }
	int getBan() { return ban; }
	int getTotalScore() { return totalScore; }
	boolean isMale() { return isMale; }
	int getHak() { return hak; }
	
	// ���� ���������� �⺻ ���ķ� �Ѵ�
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}

}
