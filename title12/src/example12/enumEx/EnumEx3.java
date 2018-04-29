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
	}; // �������� �߻�޼ҵ带 �����ϸ� �� ������ ����� �߻�޼ҵ带 �ݵ�� �����ؾ� ��
	// ���������� �� ������ ����� �߻�޼ҵ带 �Ȱ��� �������� ����, ���� �ٸ��� ���� ����
	
	protected final int BASIC_FARE; // protected�� �ؾ� �� ������� ���� ����
	
	Transportation(int basicFare) { // private Transportation(int basicFare)
		BASIC_FARE = basicFare;
	}
	
	public int getBasicFare() { return BASIC_FARE; }
	
	abstract int fare(int distance); // �Ÿ��� ���� ��� ���
	
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
