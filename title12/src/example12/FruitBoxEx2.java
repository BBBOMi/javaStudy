package example12;

import example12.Box;

public class FruitBoxEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		//FruitBox<Grape2> grapeBox = new FruitBox<Apple2>(); // ����. Ÿ�� ����ġ
		//FruitBox<Toy2> toyBox = new FruitBox<Toy2>(); // ����. Ÿ�� �Ű������� Fruit�� �ڼ��̸鼭 Eatable�������̽��� �����ؾ� �Ѵ�
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		//appleBox.add(new Grape2()); // ����. Grape�� Apple�� �ڼ��� �ƴ�
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox - " + fruitBox);
		System.out.println("appleBox - " + appleBox);
		System.out.println("grapeBox - " + grapeBox);

	}

}