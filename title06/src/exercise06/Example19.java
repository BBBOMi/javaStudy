package exercise06;

import java.util.Arrays;

public class Example19 {
	public static void change(String str) {
		str  = str.concat("456");
	}
	
	public static void change(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] += "Check";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change : " + str);
		
		/*str = str.concat("456");
		System.out.println(str);
		*/
		String[] arr = {"change1", "change2", "change3" };
		change(arr);
		System.out.println(Arrays.toString(arr));

	}

}
