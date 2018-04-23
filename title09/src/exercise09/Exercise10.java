package exercise09;

public class Exercise10 {
	public static String format(String str, int length, int alignment) {
		int diff = length - str.length();
		if(diff < 0) return str.substring(length);
		
		char[] arr = new char[length];
		for(int i=0; i<arr.length; i++)
			arr[i] = ' ';
		
		if(alignment == 0) // 왼쪽 정렬
			System.arraycopy(str.toCharArray(), 0, arr, 0, str.length());
		else if(alignment == 1) // 가운데 정렬
			System.arraycopy(str.toCharArray(), 0, arr, diff/2, str.length());
		else if(alignment == 2) // 오른쪽 정렬
			System.arraycopy(str.toCharArray(), 0, arr, diff, str.length());
		
		return new String(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "가나다";
		
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));

	}

}
