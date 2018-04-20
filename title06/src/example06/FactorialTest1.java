package example06;

public class FactorialTest1 { // p.271
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = factorial(4);
		
		System.out.println(result);
	}
	
	public static int factorial(int n) {
		if(n == 1) return 1;
		return n * factorial(n-1);
	}
}
