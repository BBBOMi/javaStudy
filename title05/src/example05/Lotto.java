package example05;

import java.util.Arrays;

public class Lotto { // p.199

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[45];
		
		for(int i=0; i<arr.length; i++)
			arr[i] = i+1;
		
		for(int i=0; i<6; i++) {
			int j = (int)(Math.random() * 45) + 1;
			
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		
		int[] lotto = Arrays.copyOf(arr, 6);
		Arrays.sort(lotto);
		
		System.out.println(Arrays.toString(lotto));
			
		//for(int i=0; i<6; i++)
			//System.out.print(arr[i] + " ");
	}

}
