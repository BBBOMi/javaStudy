package exercise07;

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
		
		b.summary();

	}

}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� " + p + "��/�� �� �� �����ϴ�.");
			return;
		}
			
		money -= p.price;
		add(p);
	}
	
	void add(Product p) {
		if(i >= cart.length) {
			Product[] carts = new Product[cart.length * 2];
			//carts = Arrays.copyOfRange(cart, 0, cart.length);
			System.arraycopy(cart, 0, carts, 0, cart.length);
			cart = carts;			
		}
		cart[i++] = p;
	}
	
	void summary() {
		int sum = 0;
		String list = "";
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i] == null)
				break;
			
			list += cart[i] + ",";
			sum += cart[i].price;
		}
		
		System.out.println("������ ����: " + list);
		System.out.println("����� �ݾ�: " + sum);
		System.out.println("���� �ݾ�: " + (money));
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