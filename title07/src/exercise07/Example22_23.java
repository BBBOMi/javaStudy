package exercise07;

abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0, 0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼ҵ�
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle(double width, double height) {
		this(new Point(0, 0), width, height);
	}
	
	Rectangle(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	boolean isSquare() { // ���簢������ �˻��ϴ� �޼ҵ�
		return width*height != 0 && width == height;
	}
	
	double calcArea() {
		return width * height;
	}
}

class Circle extends Shape {
	double r;
	
	Circle(double r) {
		this(new Point(0, 0), r);
	}
	
	Circle(Point p, double r) {
		super(p);
		this.r = r;
	}
	
	double calcArea() {
		return r*r*Math.PI;
	}
}

class Point {
	int x;
	int y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
}

public class Example22_23 {
	
	public static double sumArea(Shape[] arr) {
		double sum = 0;
		for(int i=0; i<arr.length; i++)
			sum += arr[i].calcArea();
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(4.0);
		Rectangle r = new Rectangle(2.0, 3.0);
		
		System.out.println("c�� ����: " + c.calcArea());
		System.out.println("r�� ����: " + r.calcArea());
		System.out.println("r�� ���簢���ΰ�? " + r.isSquare());
		
		Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
		System.out.println("������ ��: " + sumArea(arr));

	}

}
