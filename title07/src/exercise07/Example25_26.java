package exercise07;

public class Example25_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		Outer.InstanceInner ii = o.new InstanceInner();
		// 내부 클래스의 인스턴스를 생성하기 위해 외부클래스 생성
		// '인스턴스 클래스'는 외부 클래스의 '인스턴스 변수'처럼 외부 클래스의 인스터스가 생성되어야 쓸 수 있음
		
		System.out.println(ii.iv);
		
		Outer.StaticInner si = new Outer.StaticInner();
		// static 클래스는 인스턴스 클래스와 달리 외부 클래스의 인스턴스를 생성하지 않고도 사용 가능

		System.out.println(si.cv);
	}

}

class Outer {
	class InstanceInner {
		int iv = 100;
	}
	
	static class StaticInner {
		int cv = 200;
	}
}
