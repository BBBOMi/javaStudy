package example09;

public class CloneEx1 { // p.456-457

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point original = new Point(3, 5);
		//Point copy = (Point)original.clone();
		Point copy = original.clone();
		System.out.println(original);
		System.out.println(copy);
	}

}

class Point implements Cloneable { // Cloneable �������̽��� ������ Ŭ���������� clone()�� ȣ���� �� ����
								//	�������� �ʰ� clone()�� ȣ���ϸ� ���� �߻�
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
	/*public Object clone() { // ���������� protected -> public���� ����, ��Ӱ��谡 ���� �ٸ� Ŭ�������� clone()�� ȣ���� �� �ְ� ��
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) { }
			return obj;
	}*/
	
	public Point clone() { // ���� ��ȯ Ÿ��(��ȯŸ���� �ڼ� Ŭ������ Ÿ������ ����), Object -> Point
		Object obj = null;
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) { }
		
		return (Point)obj; // PointŸ������ ����ȯ
	}
	
	
}
