package exercise07;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	} // Example01
	
	void shuffle() {
		for(int i=0; i<cards.length; i++) {
			int ind = (int) (Math.random() * cards.length);
			SutdaCard tmp = cards[i];
			cards[i] = cards[ind];
			cards[ind] = tmp;
		}
	} // Example02_1
	
	SutdaCard pick(int index) {
		if(index < 0 || index >= CARD_NUM) return null; // 유효성 검사
		return cards[index];
	} // Example02_2
	
	SutdaCard pick() {
		int index = (int) (Math.random() * cards.length);
		return pick(index);
	} // Example02_3
}

class SutdaCard {
	final int NUM;
	final boolean IS_KWANG;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.NUM = num;
		this.IS_KWANG = isKwang;
	}
	
	public String toString() {
		return NUM + (IS_KWANG ? "K" : "");
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
