package exercise07;

public class Example25_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		Outer.InstanceInner ii = o.new InstanceInner();
		// ���� Ŭ������ �ν��Ͻ��� �����ϱ� ���� �ܺ�Ŭ���� ����
		// '�ν��Ͻ� Ŭ����'�� �ܺ� Ŭ������ '�ν��Ͻ� ����'ó�� �ܺ� Ŭ������ �ν��ͽ��� �����Ǿ�� �� �� ����
		
		System.out.println(ii.iv);
		
		Outer.StaticInner si = new Outer.StaticInner();
		// static Ŭ������ �ν��Ͻ� Ŭ������ �޸� �ܺ� Ŭ������ �ν��Ͻ��� �������� �ʰ� ��� ����

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
