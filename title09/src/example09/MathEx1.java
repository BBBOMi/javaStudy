package example09;

public class MathEx1 { // p. 483-484

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double val = 90.7552;
		System.out.println("round(" + val + ") = " + Math.round(val)); // �ݿø�
		
		val *= 100;
		System.out.println("round(" + val + ")/100 = " + Math.round(val)/100);
		System.out.println("round(" + val + ")/100.00 = " + Math.round(val)/100.00);
		System.out.println();
		
		System.out.printf("ceil(%3.1f) = %3.1f%n", 1.1, Math.ceil(1.1)); // �ø�
		System.out.printf("floor(%3.1f) = %3.1f%n", 1.5, Math.floor(1.5)); // ����
		System.out.printf("round(%3.1f) = %d%n", 1.1, Math.round(1.1));
		System.out.printf("round(%3.1f) = %d%n", 1.5, Math.round(1.5));
		System.out.printf("rint(%3.1f) = %f%n", 1.5, Math.rint(1.5)); // �ݿø�(��ȯ��: double)
		System.out.printf("round(%3.1f) = %d%n", -1.5, Math.round(-1.5));
		System.out.printf("rint(%3.1f) = %f%n", -1.5, Math.rint(-1.5));
		// rint(double a): �־��� double���� ���� ����� �������� double������ ��ȯ
		// round(double a): �Ҽ��� ù°�ڸ����� �ݿø��� ������(long)�� ��ȯ
		// �Ű������� ���� ������ �� rint()�� round()�� ������� �ٸ�
		System.out.printf("ceil(%3.1f) = %f%n", -1.5, Math.ceil(-1.5));
		System.out.printf("floor(%3.1f) = %f%n", -1.5, Math.floor(-1.5));
		
		
	}

}
