package exercise04;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fibonnaci ������ ������ ù �� ���ڸ� 1, 1�� �Ѵ�.
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // ����° ��
		System.out.print(num1 + ", " + num2);
		
		for(int i=0; i<8; i++) {
			int tmp1;
			int tmp2;
						
			num3 = num1 + num2;
			tmp1 = num2;
			tmp2 = num3;
			
			System.out.print(", " + num3);
		}

	}

}
