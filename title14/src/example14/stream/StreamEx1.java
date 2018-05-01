package example14.stream;

import java.util.*;
import java.util.stream.*;

public class StreamEx1 { // p.826

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Student> studentStream = Stream.of(
				new Student("���ڹ�", 3, 300),
				new Student("���ڹ�", 1, 200),
				new Student("���ڹ�", 2, 100),
				new Student("���ڹ�", 2, 150),
				new Student("���ڹ�", 1, 200),
				new Student("���ڹ�", 3, 290),
				new Student("���ڹ�", 3, 180));
		
		studentStream.sorted(Comparator.comparing(Student::getBan) // �ݺ� ����
				.thenComparing(Comparator.naturalOrder())) // �⺻ ����
				.forEach(System.out::println);
	}

}
