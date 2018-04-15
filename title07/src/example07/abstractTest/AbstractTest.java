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
	//»ó¼ö ¼±¾ðµµ °¡´É
	public String name = "name";
	public void move() {
		System.out.println("¾î½½·· ¾î½½··");
	}
	abstract void howl();
}

class Dog extends Animal {
	public void move() {
		System.out.println("ÆÈÂ¦ ÆÈÂ¦");
	}
	
	void howl() {
		System.out.println("¸Û¸Û");
	}
}

class Cat extends Animal {
	void howl() {
		System.out.println("³Ä¿ë");
	}
}
