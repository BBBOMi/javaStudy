package example12.annotation;


/* @Deprecated�� ���̻� ������ �ʴ� �ʵ峪 �޼��忡 ���̴� ��
 * '�ٸ� ������ ��ü�Ǿ����� �� �̻� ������� ���� ���� ���Ѵ�'�� �ǹ�
 * @Deprecated�� ���� ����� ������� �ʵ��� ���� �� �������� ����
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
		
		nc.oldField = 10; // @Deprecated�� ���� ����� ���
		System.out.println(nc.getOldField()); // @Deprecated�� ���� ����� ���
	}

}
