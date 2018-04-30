package example12.annotation;

import java.util.Arrays;

/* 메소드에 선언된 가변인자의 타입이 non-reifiable타입일 경우, 해당 메소드를 선언하는 부분에서 unchecked 경고 발생 - @SafeVarargs를 사용해 경고 억제
 * (non-reifiable: 컴파일 후에 제거되는 타입, 지네릭 타입들의 대부분은 non-reifiable 타입임)
 * @SafeVarargs는 '이 메소드의 가변인자는 타입 안정성이 있다'라고 컴파일러에게 알려 경고가 발생하지 않도록 함
 * 생성자와 static, final이 붙은 메소드에만 붙일 수 있음 즉, 오버라이드될 수 있는 메소드에는 사용할 수 없음
 * 선언할 때 @SafeVarargs를 붙이면 이 메소드를 호출 하는 곳에서 발생하는 경고도 억제된다.
 * 보통 @SuppressWarnings("varargs")를 같이 붙인다.
 */

class MyArrayList<T> {
	T[] arr;
	
	@SafeVarargs
	@SuppressWarnings("varargs")
	MyArrayList(T... arr) {
		this.arr = arr;
	}
	
	@SafeVarargs
	@SuppressWarnings("varargs")
//	@SuppressWarnings("unchecked")
	public static <T> MyArrayList<T> asList(T... a) {
		return new MyArrayList<>(a);
	}
	
	public String toString() {
		return Arrays.toString(arr);
	}
}

public class AnnotationEx4 {
//	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList<String> list = MyArrayList.asList("1", "2", "3");
		
		System.out.println(list);
	}

}
