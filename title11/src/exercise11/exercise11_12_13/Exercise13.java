package exercise11.exercise11_12_13;

import java.util.*;

public class Exercise13 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SutdaDeck deck = new SutdaDeck();
		
		deck.shuffle();
		
		Player[] pArr = {
				new Player("Ÿ¥", deck.pick(), deck.pick()),
				new Player("���", deck.pick(), deck.pick()),
				new Player("����", deck.pick(), deck.pick()),
				new Player("�߼�", deck.pick(), deck.pick()),
				new Player("�ϼ�", deck.pick(), deck.pick())
		};
		
		TreeMap rank = new TreeMap(new Comparator() {
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Player && o2 instanceof Player) {
					Player p1 = (Player)o1;
					Player p2 = (Player)o2;
					
					return p2.point - p1.point; // ���� ������ ������������ ����
				}
				return -1;
			}
		}); // #13
		
		for(int i=0; i<pArr.length; i++) {
			Player p = pArr[i];
			rank.put(p, deck.getPoint(p));
			System.out.println(p + " " + deck.getPoint(p));
		}
		
		System.out.println();
		System.out.println("1���� " + rank.firstKey() + "�Դϴ�.");

	}

}
