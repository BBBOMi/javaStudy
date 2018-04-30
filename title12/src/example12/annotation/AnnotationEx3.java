package example12.annotation;

import java.util.ArrayList;

/* @SuppressWarnings�� �����Ϸ��� �����ִ� ���޽����� ��Ÿ���� �ʰ� �������ش�
 * @SuppressWarnigs�� ������ �� �ִ� �ַ� ����ϴ� ��� �޽�����
 *  -"deprecation" : @Deprecated�� ���� ����� ����ؼ� �߻��ϴ� ��� ����
 *  -"unchecked" : ���׸����� Ÿ���� �������� �ʾ��� �� �߻��ϴ� ��� ����
 *  -"rawtypes" : ���׸����� ������� �ʾƼ� �߻��ϴ� ��� ����
 *  -"varargs" : ���������� Ÿ���� ���׸� Ÿ���� �� �߻��ϴ� ��� ����
 *  �� �̻��� ��� ���ÿ� �����Ϸ��� @SuppressWarnigs({"deprecation", "unchecked", "varargs"})
 */

public class AnnotationEx3 {
	@SuppressWarnings("deprecation") // deprecation���� ��� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewClass nc = new NewClass();
		
		nc.oldField = 10; // @Deprecated�� ���� ����� ���
		System.out.println(nc.getOldField()); // @Deprecated�� ���� ����� ���
		
		@SuppressWarnings("unchecked") // ���׸��� ���� ��� ����
		ArrayList<NewClass> list = new ArrayList(); // Ÿ���� �������� ����
		list.add(nc);
	}

}
