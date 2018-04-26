package example11.set;

import java.util.*;

public class TreeSetEx2 { // p.643

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i=0; i<score.length; i++)
			set.add(score[i]);
		
		System.out.println("50보다 작은 값: " + set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값: " + set.tailSet(new Integer(50))); // 50포함
	}

}
