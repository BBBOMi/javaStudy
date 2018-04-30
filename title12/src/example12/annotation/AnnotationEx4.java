package example12.annotation;

import java.util.Arrays;

/* �޼ҵ忡 ����� ���������� Ÿ���� non-reifiableŸ���� ���, �ش� �޼ҵ带 �����ϴ� �κп��� unchecked ��� �߻� - @SafeVarargs�� ����� ��� ����
 * (non-reifiable: ������ �Ŀ� ���ŵǴ� Ÿ��, ���׸� Ÿ�Ե��� ��κ��� non-reifiable Ÿ����)
 * @SafeVarargs�� '�� �޼ҵ��� �������ڴ� Ÿ�� �������� �ִ�'��� �����Ϸ����� �˷� ��� �߻����� �ʵ��� ��
 * �����ڿ� static, final�� ���� �޼ҵ忡�� ���� �� ���� ��, �������̵�� �� �ִ� �޼ҵ忡�� ����� �� ����
 * ������ �� @SafeVarargs�� ���̸� �� �޼ҵ带 ȣ�� �ϴ� ������ �߻��ϴ� ��� �����ȴ�.
 * ���� @SuppressWarnings("varargs")�� ���� ���δ�.
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
