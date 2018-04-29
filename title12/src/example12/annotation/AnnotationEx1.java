package example12.annotation;


/* @Override는 조상의 메소드를 오버라이딩하는 것이라는 걸 컴파일러에게 알려주는 역할을 한다
 * 컴파일러가 같은 이름의 메소드가 조상에 있는지 확인하고 없으면, 에러메시지를 출력*/

class Parent {
	void ParentMethod() { }
}

class Child extends Parent {
	@Override
	//void parentmethod() { } // 에러. 조상 메소드의 이름을 잘못 적었음
	void ParentMethod() { } // OK
}

public class AnnotationEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
