package example07;

public class InnerEx { // p.405
	// �ܺ� Ŭ�������� static ���� ���� ����
	class InstanceInner { // instance inner class
		int iv = 100;
		//static int cv = 100; // staticŬ������ �ƴ϶� static ������� ���� �Ұ�
		final static int CONST = 100; // ��� ���
	}
	
	static class StaticInner { // static inner class
		int iv = 200;
		static int cv = 200; // static class ���̶� static ���� ���� ����
	}
	
	void myMethod() {
		class LocalInner { // local class : ���� Ŭ����
			int iv = 300;
			// static int cv = 300; // static class�� �ƴ� instance class �ȿ��� static ���� ���� �Ұ�
			final static int CONST = 300; // ��� ���
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(InstanceInner.iv); // static method �ȿ��� instance ��� ���� �Ұ�
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);

	}

}
