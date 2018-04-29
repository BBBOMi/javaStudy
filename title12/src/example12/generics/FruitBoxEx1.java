package example12.generics;

public class FruitBoxEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		//Box<Grape> grapeBox = new Box<Apple>(); // ����. Ÿ�� ����ġ -> Ÿ�Ժ����� �׻� ��ġ�ؾ���
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // void add(Fruit item)�̹Ƿ� ����
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		//appleBox.add(new Toy()); // ����. Box<Apple>���� Apple�� ���� �� ����
		
		toyBox.add(new Toy());
		//toyBox.add(new Apple()); // ����. Box<Toy>���� Apple�� ���� �� ����. Toy�� ����
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}

}
	
