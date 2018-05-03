package exercise14;

import java.util.Random;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Random().ints(1, 46) // 1~45사이의 정수(46은 포함 안됨)
					.distinct() // 중복 제거
					.limit(6) // 6개만
					.sorted() // 정렬
					.forEach(System.out::println); // 화면에 출력
	}

}
