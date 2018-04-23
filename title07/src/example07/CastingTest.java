package example07;

public class CastingTest { // p.361

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car =  new Car();
		Car car2 = new FireEngine(); // ����Ÿ���� ���� ������ �ڼ�Ÿ���� �ν��Ͻ� ����
		Car car3 = new Car();
		
		FireEngine fe = new FireEngine();
		//FireEngine fe2 = new Car(); // �ڼ�Ÿ���� ���� ������ ����Ÿ���� �ν��Ͻ� ���� �Ұ�
		// �ڼ�Ÿ���� ���������� ����Ÿ���� �ν��Ͻ��� �����ϴ� ���� �������� �ʴ� ����� ����� ���ɼ��� �����Ƿ� ������� �ʴ´�.
		FireEngine fe3 = null;
		
		System.out.println("Car�� ��: " + car2.color); // �ν��Ͻ� ���� ���� ���������� Ÿ�Կ� ���� �޶���
		System.out.println("Car�� ���� ����: " + car2.door);
		car2.drive();
		car2.stop(); // ���������� Ÿ�Կ� ������� �׻� ���� �ν��Ͻ��� Ÿ�Կ� ���ǵ� �޼ҵ尡 ȣ��
		//car2.water(); // �ڼ�Ÿ���� �ν��Ͻ��� ���� �ϰ� �ִ��� water() �޼ҵ尡 ����Ÿ���� ����� �ƴϱ� ������ ��� �Ұ�
		// �ڼ�Ÿ���� ��� �� ����Ÿ���� ����� ��� ����
		
		System.out.println();
		System.out.println("FireEngine�� ��: " + fe.color); // �ν��Ͻ� ���� ���� ���������� Ÿ���� ���� �޶���
		System.out.println("FireEngine�� ���� ����: " + fe.door); // �������κ��� ����� ��ӹ���
		fe.drive(); // ��ӹ���
		fe.stop();
		fe.water();
		
		System.out.println();
		
		car = fe; // �ڼ� -> ����,  Up-casting, ����ȯ ���� ����
		car.drive();
		car.stop(); // �ڼ�Ÿ���� �޼ҵ� ȣ���, ���� �ν��Ͻ��� Ÿ�Կ� ���ǵ� �޼ҵ� ȣ��
		//car.water(); // Up-casting �Ŀ��� ��� �Ұ�
		
		System.out.println();
		
		fe3 = (FireEngine)car2; // ���� -> �ڼ�, Down-casting, ����ȯ ���� �Ұ�
		fe3.drive();
		fe3.stop(); // �ڼ�Ÿ���� �޼ҵ� ȣ���
		fe3.water(); // �ڼ�Ÿ���� ���� ������ �ڼ�Ÿ���� �ν��Ͻ��� �����ϰ� �����Ƿ� �ڼո�� ��� ����
		
		//fe3 = (FireEngine)car3; // Down-casting , ������ ����
		// ���� ��� ���迡 �ִ� Ÿ�԰��� ����ȯ�� ��������� �����Ӱ� ����� �� ������,
		// ���� ������ ����Ű�� �ν��Ͻ��� �ڼ�Ÿ������ ����ȯ�� ������� �ʴ´�. -> ������ ���� ����
		// ���� ���������� ����Ű�� �ν��Ͻ��� Ÿ���� �������� Ȯ�� �ϴ°��� �߿�
	}

}

class Car {
	String color = "White";
	int door = 4; // ����Ÿ���� ��� ����
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("Car: stop!!!");
	}
}

class FireEngine extends Car {
	String color = "Red"; // �ڼ�Ÿ�� ��� ����
	
	@Override
	void stop() {
		System.out.println("FireEngine: stop!!!"); // �ڼ�Ÿ�Կ� �°� �������̵�
	}
	
	void water() {
		System.out.println("water!!!"); // �޼ҵ� �߰�
	}
}
