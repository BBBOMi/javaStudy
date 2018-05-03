package exercise14;

import java.util.*;
import java.util.stream.Stream;

public class Exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"aaa", "bb", "c", "dddd" };
		Stream<String> strStream = Arrays.stream(strArr);
		
		/*strStream
			.sorted(Comparator.comparingInt(String::length).reversed())
			.limit(1).forEach(System.out::println); // ���� �� ���ڿ� ���� ���
		*/
		
		strStream.map(String::length)  // strStream.map(s -> s.length)
		.sorted(Comparator.reverseOrder()) // ���ڿ� ���̷� ���� ����
		.limit(1).forEach(System.out::println); // ���� �� ���ڿ��� ���� ���
	}
}
