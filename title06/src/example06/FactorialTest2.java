package example06;

public class FactorialTest2 { // p.275
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		int result = 0;
		
		for(int i=1; i<= n; i++) {
			result = factorial(i);
			
			if(result == -1) {
				System.out.printf("유효하지 않은 값입니다. (0<n<13) : %d%n" , n);
				break;
			}
			
			System.out.printf("%2d! = %10d%n", i, result);
		}

	}
	
	public static int factorial(int n) {
		if((n < 1) || (12 < n)) return -1; // 매개변수 유효성 검사
		if(n == 1) return 1;
		return n * factorial(n-1);
	}
}
