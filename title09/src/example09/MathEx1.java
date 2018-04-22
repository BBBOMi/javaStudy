package example09;

public class MathEx1 { // p. 483-484

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double val = 90.7552;
		System.out.println("round(" + val + ") = " + Math.round(val)); // 반올림
		
		val *= 100;
		System.out.println("round(" + val + ")/100 = " + Math.round(val)/100);
		System.out.println("round(" + val + ")/100.00 = " + Math.round(val)/100.00);
		System.out.println();
		
		System.out.printf("ceil(%3.1f) = %3.1f%n", 1.1, Math.ceil(1.1)); // 올림
		System.out.printf("floor(%3.1f) = %3.1f%n", 1.5, Math.floor(1.5)); // 버림
		System.out.printf("round(%3.1f) = %d%n", 1.1, Math.round(1.1));
		System.out.printf("round(%3.1f) = %d%n", 1.5, Math.round(1.5));
		System.out.printf("rint(%3.1f) = %f%n", 1.5, Math.rint(1.5)); // 반올림(반환값: double)
		System.out.printf("round(%3.1f) = %d%n", -1.5, Math.round(-1.5));
		System.out.printf("rint(%3.1f) = %f%n", -1.5, Math.rint(-1.5));
		// rint(double a): 주어진 double값과 가장 가까운 정수값을 double형으로 반환
		// round(double a): 소수점 첫째자리에서 반올림한 정수값(long)을 반환
		// 매개변수의 값이 음수일 때 rint()와 round()의 결과값이 다름
		System.out.printf("ceil(%3.1f) = %f%n", -1.5, Math.ceil(-1.5));
		System.out.printf("floor(%3.1f) = %f%n", -1.5, Math.floor(-1.5));
		
		
	}

}
