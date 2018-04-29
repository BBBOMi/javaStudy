package example12.annotation;


/* @Deprecated는 더이상 사용되지 않는 필드나 메서드에 붙이는 것
 * '다른 것으로 대체되었으니 더 이상 사용하지 않을 것을 권한다'는 의미
 * @Deprecated가 붙은 대상을 사용하지 않도록 권할 뿐 강제성은 없다
 */

class NewClass {
	int newField;
	
	int getNewField() { return newField; }
	
	@Deprecated
	int oldField;
	
	@Deprecated
	int getOldField() { return oldField; }
}

public class AnnotationEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewClass nc = new NewClass();
		
		nc.oldField = 10; // @Deprecated가 붙은 대상을 사용
		System.out.println(nc.getOldField()); // @Deprecated가 붙은 대상을 사용
	}

}
