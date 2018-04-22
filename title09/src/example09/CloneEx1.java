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

class Point implements Cloneable { // Cloneable 인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있음
								//	구현하지 않고 clone()을 호출하면 예외 발생
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
	/*public Object clone() { // 접근제어자 protected -> public으로 변경, 상속관계가 없는 다른 클래스에서 clone()을 호출할 수 있게 함
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) { }
			return obj;
	}*/
	
	public Point clone() { // 공변 반환 타입(반환타입을 자손 클래스의 타입으로 변경), Object -> Point
		Object obj = null;
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) { }
		
		return (Point)obj; // Point타입으로 형변환
	}
	
	
}
