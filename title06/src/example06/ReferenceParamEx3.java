package example06;

public class ReferenceParamEx3 { // p.267
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {3, 2, 1, 6, 5, 4};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum = " + sumArr(arr));

	}
	
	static void printArr(int[] arr) {
		for(int i : arr)
			System.out.print(i + " ");
		
		System.out.println();
		
	}
	
	static int sumArr(int[] arr) {
		int sum = 0;
		for(int i : arr)
			sum += i;
		
		return sum;
	}
	
	static void sortArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

}
