package exercise14;

import java.util.Arrays;
import java.util.stream.*;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"aaa", "bb", "c", "dddd"};
		//Stream<String> strStream = Stream.of(strArr);
		Stream<String> strStream = Arrays.stream(strArr);
		
		int sum = strStream.mapToInt(String::length).sum();
		
		System.out.println("sum = " + sum);
	}

}
