package example11;

import java.util.Arrays;

public class ArraysEx {  // p. 626-627
		/* Arrays의 잘쓰이는 메소드들 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};
		
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("arr2D = " + Arrays.deepToString(arr2D)); // 다차원배열 출력할 때는 deepToString() 사용
		System.out.println();
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		System.out.println("arr2 = " + Arrays.toString(arr2));
		System.out.println("arr3 = " + Arrays.toString(arr3));
		System.out.println("arr4 = " + Arrays.toString(arr4));
		System.out.println("arr5 = " + Arrays.toString(arr5));
		System.out.println("arr6 = " + Arrays.toString(arr6));
		System.out.println();
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random() * 6) + 1);
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		for(int i : arr7) {
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph) + i);
		}
		
		String[][] str2D = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		
		System.out.println();
		System.out.println(Arrays.equals(str2D,  str2D2));
		System.out.println(Arrays.deepEquals(str2D,  str2D2)); // 다차원 배열을 비교할 땐 deepEquals()를 써야함
		System.out.println();
		
		char[] chArr = { 'A', 'D', 'C', 'B', 'E'};
		
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B')); // 정렬하지 않아 잘못된 결과 출력
		System.out.println("= After sorting =");
		Arrays.sort(chArr);
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr , 'B'));
	}

}
