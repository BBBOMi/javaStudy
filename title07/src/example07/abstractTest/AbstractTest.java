package example07.abstractTest;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog happy = new Dog();
		Cat julia = new Cat();
		System.out.println(happy.name);
		happy.move();
		happy.howl();
		System.out.println(julia.name);
		julia.move();
		julia.howl();

	}

}

abstract class Animal {
	//��� ���� ����
	public String name = "name";
	public void move() {
		System.out.println("��� ���");
	}
	abstract void howl();
}

class Dog extends Animal {
	public void move() {
		System.out.println("��¦ ��¦");
	}
	
	void howl() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal {
	void howl() {
		System.out.println("�Ŀ�");
	}
}
