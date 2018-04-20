package exercise07;

abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0, 0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메소드
	
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
	
	boolean isSquare() { // 정사각형인지 검사하는 메소드
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
		
		System.out.println("c의 넓이: " + c.calcArea());
		System.out.println("r의 넓이: " + r.calcArea());
		System.out.println("r은 정사각형인가? " + r.isSquare());
		
		Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
		System.out.println("면적의 합: " + sumArea(arr));

	}

}
