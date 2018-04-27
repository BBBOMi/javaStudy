package exercise11.exercise11_12_13;

public class Exercise12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SutdaDeck deck = new SutdaDeck();
		
		deck.shuffle();
		Player p1 = new Player("타짜", deck.pick(), deck.pick());
		Player p2 = new Player("고수", deck.pick(), deck.pick());
		
		System.out.println(p1 + " " + deck.getPoint(p1));
		System.out.println(p2 + " " + deck.getPoint(p2));
	}

}
