package example12.annotation;


/* @Override�� ������ �޼ҵ带 �������̵��ϴ� ���̶�� �� �����Ϸ����� �˷��ִ� ������ �Ѵ�
 * �����Ϸ��� ���� �̸��� �޼ҵ尡 ���� �ִ��� Ȯ���ϰ� ������, �����޽����� ���*/

class Parent {
	void ParentMethod() { }
}

class Child extends Parent {
	@Override
	//void parentmethod() { } // ����. ���� �޼ҵ��� �̸��� �߸� ������
	void ParentMethod() { } // OK
}

public class AnnotationEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
