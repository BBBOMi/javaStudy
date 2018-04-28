package example12;

import example12.Box;

public class FruitBoxEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		//FruitBox<Grape2> grapeBox = new FruitBox<Apple2>(); // 에러. 타입 불일치
		//FruitBox<Toy2> toyBox = new FruitBox<Toy2>(); // 에러. 타입 매개변수는 Fruit의 자손이면서 Eatable인터페이스도 구현해야 한다
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		//appleBox.add(new Grape2()); // 에러. Grape는 Apple의 자손이 아님
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox - " + fruitBox);
		System.out.println("appleBox - " + appleBox);
		System.out.println("grapeBox - " + grapeBox);

	}

}