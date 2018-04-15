package exercise07;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			if(i<10) {
				cards[i] = new SutdaCard(i+1,((i+1==1 || i+1==3 || i+1==8) ? true : false ));
			} else
				cards[i] = new SutdaCard(i-9, false);
		}
	} // Example01
	
	void shuffle() {
		for(int i=0; i<cards.length; i++) {
			int ind = (int) (Math.random() * cards.length);
			SutdaCard tmp = cards[i];
			cards[i] = cards[ind];
			cards[ind] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		int index = (int) (Math.random() * cards.length);
		return pick(index);
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Example01_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i <deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));

	}

}
