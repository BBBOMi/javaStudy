package example09;

public class MathEx2 { // p. 485

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = Integer.MIN_VALUE;
		
		System.out.println("i = " + i);
		System.out.println("-i = " + -i); // 변수i의 부호를 바꿨지만 오버플로우(overflow) 발생으로 값 변경 X 
		
		try {
			System.out.printf("negateExact(%d) = %d%n", 10, Math.negateExact(10));
			System.out.printf("negateExact(%d) = %d%n", -10, Math.negateExact(-10));
			System.out.printf("negateExact(%d) = %d%n", i, Math.negateExact(i));
		} catch(ArithmeticException e) {
			// i를 long타입으로 형변환 다음에 negateExact(long a)호출
			System.out.printf("negateExact(%d) = %d%n", (long)i, Math.negateExact((long)i));
		}
		
		/* --JDK1.8부터 새로 추가된 메소드
		 * 	정수형 간의 연산에서 발생할 수 있는 오버플로우(overflow)를 감지하기 위한 것.
		 * 	오버플로우 발생 시, 예외(ArithmeticException)를 발생시킴
		 *
		 * static int addExact(int x, int y) // x+y
		 * static int subtractExact(int x, int y) // x-y
		 * static int multiplyExact(int x, int y) // x*y
		 * static int incrementExact(int a) // a++
		 * static int decrementExact(int a) // a--
		 * static int negateExact(int a) // -a
		 * static int toIntExact(long value) // (int)value - int로의 형변환
		 */

	}

}
