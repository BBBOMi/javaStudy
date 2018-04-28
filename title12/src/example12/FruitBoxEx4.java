package example12;

import java.util.Collections;
import java.util.Comparator;

class AppleComp implements Comparator<Apple> {
	public int compare(Apple t1, Apple t2) {
		return t2.weight - t1.weight; // 무게를 기준으로 내림차순으로 정렬
	}
}

class GrapeComp implements Comparator<Grape> {
	public int compare(Grape t1, Grape t2) {
		return t2.weight - t1.weight; // 무게를 기준으로 내림차순으로 정렬
	}
}

class FruitComp implements Comparator<Fruit> {
	public int compare(Fruit t1, Fruit t2) {
		return t1.weight - t2.weight; // 무게를 기준으로 오름차순으로 정렬
	}
}

public class FruitBoxEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		appleBox.add(new Apple("GreenApple", 300));
		appleBox.add(new Apple("GreenApple", 100));
		appleBox.add(new Apple("GreenApple", 200));
		
		grapeBox.add(new Grape("GreenGrape", 400));
		grapeBox.add(new Grape("GreenGrape", 300));
		grapeBox.add(new Grape("GreenGrape", 200));
		
		 // static <T> void sort(List<T> list, Comparator<? super T> c) // Comparator의 타입 매개변수로 T와 그 조상들만 가능하다는 뜻
																		// 'super'키워드로 와일드카드의 하한을 제한.
		Collections.sort(appleBox.getList(), new AppleComp());
		Collections.sort(grapeBox.getList(), new GrapeComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		
		Collections.sort(appleBox.getList(), new FruitComp());
		Collections.sort(grapeBox.getList(), new FruitComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
	}

}
