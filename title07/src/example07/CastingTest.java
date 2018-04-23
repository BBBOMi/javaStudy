package example07;

public class CastingTest { // p.361

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car =  new Car();
		Car car2 = new FireEngine(); // 조상타입의 참조 변수로 자손타입의 인스턴스 참조
		Car car3 = new Car();
		
		FireEngine fe = new FireEngine();
		//FireEngine fe2 = new Car(); // 자손타입의 참조 변수로 조상타입의 인스턴스 참조 불가
		// 자손타입의 참조변수로 조상타입의 인스턴스를 참조하는 것은 존재하지 않는 멤버를 사용할 가능성이 있으므로 허용하지 않는다.
		FireEngine fe3 = null;
		
		System.out.println("Car의 색: " + car2.color); // 인스턴스 변수 값은 참조변수의 타입에 따라 달라짐
		System.out.println("Car의 문의 개수: " + car2.door);
		car2.drive();
		car2.stop(); // 참조변수의 타입에 관계없이 항상 실제 인스턴스의 타입에 정의된 메소드가 호출
		//car2.water(); // 자손타입의 인스턴스를 참조 하고 있더라도 water() 메소드가 조상타입의 멤버가 아니기 때문에 사용 불가
		// 자손타입의 멤버 중 조상타입의 멤버만 사용 가능
		
		System.out.println();
		System.out.println("FireEngine의 색: " + fe.color); // 인스턴스 변수 값은 참조변수의 타입의 따라 달라짐
		System.out.println("FireEngine의 문의 개수: " + fe.door); // 조상으로부터 멤버를 상속받음
		fe.drive(); // 상속받음
		fe.stop();
		fe.water();
		
		System.out.println();
		
		car = fe; // 자손 -> 조상,  Up-casting, 형변환 생략 가능
		car.drive();
		car.stop(); // 자손타입의 메소드 호출됨, 실제 인스턴스의 타입에 정의된 메소드 호출
		//car.water(); // Up-casting 후에도 사용 불가
		
		System.out.println();
		
		fe3 = (FireEngine)car2; // 조상 -> 자손, Down-casting, 형변환 생략 불가
		fe3.drive();
		fe3.stop(); // 자손타입의 메소드 호출됨
		fe3.water(); // 자손타입의 참조 변수로 자손타입의 인스턴스를 참조하고 있으므로 자손멤버 사용 가능
		
		//fe3 = (FireEngine)car3; // Down-casting , 컴파일 에러
		// 서로 상속 관계에 있는 타입간의 형변환은 양방향으로 자유롭게 수행될 수 있으나,
		// 참조 변수가 가리키는 인스턴스의 자손타입으로 형변환은 혀용되지 않는다. -> 컴파일 에러 원인
		// 따라서 참조변수가 가리키는 인스턴스의 타입이 무엇인지 확인 하는것이 중요
	}

}

class Car {
	String color = "White";
	int door = 4; // 조상타입의 멤버 변수
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("Car: stop!!!");
	}
}

class FireEngine extends Car {
	String color = "Red"; // 자손타입 멤버 변수
	
	@Override
	void stop() {
		System.out.println("FireEngine: stop!!!"); // 자손타입에 맞게 오버라이딩
	}
	
	void water() {
		System.out.println("water!!!"); // 메소드 추가
	}
}
