package exercise14;

import java.util.Arrays;
import java.util.stream.*;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> dice = IntStream.rangeClosed(1, 6).boxed();
		
		dice.flatMap(i -> Stream.of(1,2,3,4,5,6).map(i2 -> new int[] {i, i2}))
			.filter(iArr -> iArr[0] + iArr[1] == 6)
			.forEach(iArr -> System.out.println(Arrays.toString(iArr)));

	}

}
