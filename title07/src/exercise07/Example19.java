package exercise07;

import java.util.Arrays;

public class Example19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summery();

	}

}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� " + p + "��/�� �� �� �����ϴ�.");
		} else {
			money -= p.price;
			add(p);
		}
	}
	
	void add(Product p) {
		if(i >= cart.length) {
			Product[] carts = new Product[cart.length * 2];
			carts = Arrays.copyOf(cart, cart.length - 1);
			cart = carts;
			
		}
		cart[i++] = p;
	}
	
	void summery() {
		int sum = 0;
		System.out.print("������ ����: ");
		for(int i=0; i<cart.length; i++) {
			System.out.print(cart[i] + ", ");
			sum += cart[i].price;
		}
		
		System.out.println("����� �ݾ�: " + sum);
		System.out.println("���� �ݾ�: " + (money - sum));
	}
}

class Product {
	int price;
	
	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() { super(100); }
	
	public String toString() { 
		return "Tv" ; 
	}
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() { super(50); }
	
	public String toString() {
		return "Audio";
	}
}