package example14.stream;

public class Student implements Comparable<Student>{
	String name;
	int ban;
	int totalScore;
	
	boolean isMale; // 성별
	int hak; // 학년
	
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
		return String.format("[%s, %s, %d학년, %d반, %3d점]", name, isMale ? "남" : "여" , hak, ban, totalScore).toString();
	}
	
	// groupingBy()에서 사용
	enum Level { HIGH, MID, LOW } // 성적을 상, 중, 하 세 단계로 분류
	
	String getName() { return name; }
	int getBan() { return ban; }
	int getTotalScore() { return totalScore; }
	boolean isMale() { return isMale; }
	int getHak() { return hak; }
	
	// 총점 내림차순을 기본 정렬로 한다
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}

}
