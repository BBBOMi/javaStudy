package example07;

public class CastingTest { // p.361

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car =  new Car();
		Car car2 = new FireEngine();
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		/*car = fe;
		fe2 = (FireEngine)car;*/
		
		//car2.water();
		fe2 = (FireEngine)car2;
		fe2.water();
		
		//fe2 = (FireEngine)car;
		fe2.drive();
		

	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}
