package example06;

public class PowerTest { // p.276
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2, n = 5;
		long sum = 0, result = 0;
		
		for(int i=1; i<=n; i++) {
			result = power(x, i);
			System.out.printf("%d ^ %d = %d%n", x, i, result);
			sum += result;
		}
		
		System.out.println("รัวี: " + sum);

	}
	
	public static long power(int x, int n) {
		if(n == 1) return x;
		return x * power(x, n-1);
	}

}
