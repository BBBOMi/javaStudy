package example14.stream;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

public class StreamEx7 { // p.852-854

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stuArr = {
				new Student("���ڹ�", true, 1, 1, 300),
				new Student("������", false, 1, 1, 250),
				new Student("���ڹ�", true, 1, 1, 200),
				new Student("������", false, 1, 2, 150),
				new Student("���ڹ�", true, 1, 2, 100),
				new Student("������", false, 1, 2, 50),
				new Student("Ȳ����", false, 1, 3, 100),
				new Student("������", false, 1, 3, 150),
				new Student("���ڹ�", true, 1, 3, 200),
				
				new Student("���ڹ�", true, 2, 1, 300),
				new Student("������", false, 2, 1, 250),
				new Student("���ڹ�", true, 2, 1, 200),
				new Student("������", false, 2, 2, 150),
				new Student("���ڹ�", true, 2, 2, 100),
				new Student("������", false, 2, 2, 50),
				new Student("Ȳ����", false, 2, 3, 100),
				new Student("������", false, 2, 3, 150),
				new Student("���ڹ�", true, 2, 3, 200)
		};
		
		System.out.printf("1. �ܼ�����(������ ����) %n");
		Map<Boolean, List<Student>> stuBySex = Stream.of(stuArr)
										.collect(partitioningBy(Student::isMale));
		
		List<Student> maleStudent = stuBySex.get(true);
		List<Student> femaleStudent = stuBySex.get(false);
		
		for(Student s : maleStudent) System.out.println(s);
		for(Student s : femaleStudent) System.out.println(s);
		
		System.out.printf("%n2. �ܼ����� + ���(���� �л���) %n");
		Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
									.collect(partitioningBy(Student::isMale, counting()));
		System.out.println("���л� ��: " + stuNumBySex.get(true));
		System.out.println("���л� ��: " + stuNumBySex.get(false));
		
		System.out.printf("%n3. �ܼ����� + ���(���� 1��) %n");
		Map<Boolean, Optional<Student>> topScoreBySex = Stream.of(stuArr)
												.collect(partitioningBy(Student::isMale,
														maxBy(comparingInt(Student::getTotalScore))
														));
		System.out.println("���л� 1��: " + topScoreBySex.get(true));
		System.out.println("���л� 1�� : " + topScoreBySex.get(false));
		
		Map<Boolean, Student> topScoreBySex2 = Stream.of(stuArr)
										.collect(partitioningBy(Student::isMale,
												collectingAndThen(
													maxBy(comparingInt(Student::getTotalScore)), Optional::get
													)
												));
		System.out.println("���л� 1��: " + topScoreBySex2.get(true));
		System.out.println("���л� 1��: " + topScoreBySex2.get(false));
		
		System.out.printf("%n4. ���ߺ���(���� ���հ���, 100�� ����) %n");
		Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex = 
				Stream.of(stuArr).collect(partitioningBy(Student::isMale, partitioningBy(s -> s.getTotalScore() <= 100))
						);
		List<Student> failedMaleStu = failedStuBySex.get(true).get(true);
		List<Student> failedFemaleStu = failedStuBySex.get(false).get(true);
		
		for(Student s : failedMaleStu) System.out.println(s);
		for(Student s : failedFemaleStu) System.out.println(s);
	}

}
