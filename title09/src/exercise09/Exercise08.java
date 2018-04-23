package exercise09;

public class Exercise08 {
	public static double round(double d, int n) {
		d *= Math.pow(10, n);
		return Math.round(d) / Math.pow(10, n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(round(3.1415, 1));
		System.out.println(round(3.1415, 2));
		System.out.println(round(3.1415, 3));
		System.out.println(round(3.1415, 4));
		System.out.println(round(3.1415, 5));
	}

}
