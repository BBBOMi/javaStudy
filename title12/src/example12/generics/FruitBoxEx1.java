package example12.generics;

public class FruitBoxEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		//Box<Grape> grapeBox = new Box<Apple>(); // 에러. 타입 불일치 -> 타입변수는 항상 일치해야함
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // void add(Fruit item)이므로 가능
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		//appleBox.add(new Toy()); // 에러. Box<Apple>에는 Apple만 담을 수 있음
		
		toyBox.add(new Toy());
		//toyBox.add(new Apple()); // 에러. Box<Toy>에는 Apple을 담을 수 없음. Toy만 가능
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}

}
	
