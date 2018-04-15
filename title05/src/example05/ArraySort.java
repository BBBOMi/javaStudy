package example05;

import java.util.Arrays;

public class ArraySort { // p.201

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(numArr));*/
		
		int[] arr = new int[50];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		int[] copyArr = new int[10];
		
		for(int i=0; i<copyArr.length; i++)
			copyArr[i] = arr[(int)(Math.random()*50 + 1)];
			
		for(int i=0; i<copyArr.length-1; i++) {
			for(int j=0; j<copyArr.length-1-i; j++) {
				if(copyArr[j] > copyArr[j+1]) {
					int tmp = copyArr[j];
					copyArr[j] = copyArr[j+1];
					copyArr[j+1] = tmp;
				}
			}
			System.out.println(i + Arrays.toString(copyArr));
		}
		
		System.out.println(Arrays.toString(copyArr));

	}

}
