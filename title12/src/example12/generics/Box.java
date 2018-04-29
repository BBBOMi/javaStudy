package example12.generics;

import java.util.ArrayList;

interface Eatable { }

class Fruit implements Eatable {
	String name;
	int weight;
	
	Fruit() { }
	Fruit(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() { return this.name==null? getClass().toString().substring(16) : name + "(" + weight + ")"; }
}

class Apple extends Fruit { 
	Apple() { super(); }
	Apple(String name, int weight) {
		super(name, weight);
	}
	
	//public String toString() { return "Apple"; }
}

class Grape extends Fruit {
	Grape() { super(); }
	Grape(String name, int weight) {
		super(name, weight);
	}
	//public String toString() { return "Grape"; }
}

class Toy { public String toString() { return "Toy"; } }

class FruitBox<T extends Fruit & Eatable> extends Box<T> { }

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	ArrayList<T> getList() { return list; }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}