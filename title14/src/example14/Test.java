package example14;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Arrays.setAll(arr, (i) -> (int)(Math.random() * 5) + 1);

	}

}
