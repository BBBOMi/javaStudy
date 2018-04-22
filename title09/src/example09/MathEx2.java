package example09;

public class MathEx2 { // p. 485

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = Integer.MIN_VALUE;
		
		System.out.println("i = " + i);
		System.out.println("-i = " + -i); // ����i�� ��ȣ�� �ٲ����� �����÷ο�(overflow) �߻����� �� ���� X 
		
		try {
			System.out.printf("negateExact(%d) = %d%n", 10, Math.negateExact(10));
			System.out.printf("negateExact(%d) = %d%n", -10, Math.negateExact(-10));
			System.out.printf("negateExact(%d) = %d%n", i, Math.negateExact(i));
		} catch(ArithmeticException e) {
			// i�� longŸ������ ����ȯ ������ negateExact(long a)ȣ��
			System.out.printf("negateExact(%d) = %d%n", (long)i, Math.negateExact((long)i));
		}
		
		/* --JDK1.8���� ���� �߰��� �޼ҵ�
		 * 	������ ���� ���꿡�� �߻��� �� �ִ� �����÷ο�(overflow)�� �����ϱ� ���� ��.
		 * 	�����÷ο� �߻� ��, ����(ArithmeticException)�� �߻���Ŵ
		 *
		 * static int addExact(int x, int y) // x+y
		 * static int subtractExact(int x, int y) // x-y
		 * static int multiplyExact(int x, int y) // x*y
		 * static int incrementExact(int a) // a++
		 * static int decrementExact(int a) // a--
		 * static int negateExact(int a) // -a
		 * static int toIntExact(long value) // (int)value - int���� ����ȯ
		 */

	}

}
