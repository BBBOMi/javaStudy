package example12.generics;

import java.util.ArrayList;

class Juice {
	String name;
	
	Juice(String name) { this.name = name + "Juice"; }
	public String toString() { return name; }
}

class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) { // 'extends' 키워드로 와일드 카드의 상한을 제한. T와 그 자손들만 가능
		String tmp = "";
		
		for(Fruit f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}
public class FruitBoxEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));

	}

}