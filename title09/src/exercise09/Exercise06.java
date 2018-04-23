package exercise09;

public class Exercise06 {
	public static String fillZero(String src, int length) {
		if(src==null || src.length() == length) return src;
		if(length <= 0) return "";
		if(src.length() > length) return src.substring(0, length);
		
		char[] arr = new char[length];
		for(int i=0; i<arr.length; i++)
			arr[i] = '0';
		System.arraycopy(src.toCharArray(), 0, arr, length-src.length(), src.length());
		
		return new String(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
	}

}
