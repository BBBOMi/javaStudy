package exercise14;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

import example14.stream.Student;

public class Exercise09 {

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
		
		Map<Integer, Map<Integer, Long>> totalScoreByHakBan = Stream.of(stuArr)
				.collect(groupingBy(Student::getHak,
						groupingBy(Student::getBan, summingLong(Student::getTotalScore))));

		for(Object e : totalScoreByHakBan.entrySet())
			System.out.println(e);

	}

}
