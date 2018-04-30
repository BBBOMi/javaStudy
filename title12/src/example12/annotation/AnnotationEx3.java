package example12.annotation;

import java.util.ArrayList;

/* @SuppressWarnings는 컴파일러가 보여주는 경고메시지가 나타나지 않게 억제해준다
 * @SuppressWarnigs로 억제할 수 있는 주로 사용하는 경고 메시지는
 *  -"deprecation" : @Deprecated가 붙은 대상을 사용해서 발생하는 경고 억제
 *  -"unchecked" : 지네릭스로 타입을 지정하지 않았을 때 발생하는 경고 억제
 *  -"rawtypes" : 지네릭스를 사용하지 않아서 발생하는 경고 억제
 *  -"varargs" : 가변인자의 타입이 지네릭 타입일 때 발생하는 경고 억제
 *  둘 이상의 경고를 동시에 억제하려면 @SuppressWarnigs({"deprecation", "unchecked", "varargs"})
 */

public class AnnotationEx3 {
	@SuppressWarnings("deprecation") // deprecation관련 경고를 억제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewClass nc = new NewClass();
		
		nc.oldField = 10; // @Deprecated가 붙은 대상을 사용
		System.out.println(nc.getOldField()); // @Deprecated가 붙은 대상을 사용
		
		@SuppressWarnings("unchecked") // 지네릭스 관련 경고를 억제
		ArrayList<NewClass> list = new ArrayList(); // 타입을 지정하지 않음
		list.add(nc);
	}

}
