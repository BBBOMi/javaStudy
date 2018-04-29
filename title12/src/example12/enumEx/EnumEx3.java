package example12.enumEx;

enum Transportation {
	BUS(100) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	TRAIN(150) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	SHIP(100) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	AIRPLANE(300) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	}; // 열거형에 추상메소드를 선언하면 각 열거형 상수가 추상메소드를 반드시 구현해야 함
	// 예제에서는 각 열거형 상수가 추상메소드를 똑같은 내용으로 구현, 각각 다르게 구현 가능
	
	protected final int BASIC_FARE; // protected로 해야 각 상수에서 접근 가능
	
	Transportation(int basicFare) { // private Transportation(int basicFare)
		BASIC_FARE = basicFare;
	}
	
	public int getBasicFare() { return BASIC_FARE; }
	
	abstract int fare(int distance); // 거리에 따른 요금 계산
	
}

public class EnumEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bus fare = " + Transportation.BUS.fare(100));
		System.out.println("train fare = " + Transportation.TRAIN.fare(100));
		System.out.println("ship fare = " + Transportation.SHIP.fare(100));
		System.out.println("airplane fare = " + Transportation.AIRPLANE.fare(100));

	}

}
