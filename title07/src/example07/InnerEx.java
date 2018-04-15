package example07;

public class InnerEx { // p.405
	// 외부 클래스에선 static 변수 정의 가능
	class InstanceInner { // instance inner class
		int iv = 100;
		//static int cv = 100; // static클래스가 아니라 static 멤버변수 정의 불가
		final static int CONST = 100; // 상수 허용
	}
	
	static class StaticInner { // static inner class
		int iv = 200;
		static int cv = 200; // static class 안이라 static 변수 정의 가능
	}
	
	void myMethod() {
		class LocalInner { // local class : 지역 클래스
			int iv = 300;
			// static int cv = 300; // static class가 아닌 instance class 안에선 static 변수 정의 불가
			final static int CONST = 300; // 상수 허용
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(InstanceInner.iv); // static method 안에서 instance 멤버 참조 불가
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);

	}

}
