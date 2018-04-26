package example11.set;

import java.util.*;

public class HashSetEx5 { // p.637

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setUnion = new HashSet();
		HashSet setDiff = new HashSet();
		HashSet setIntersection = new HashSet();
		
		for(int i=1; setA.size()<5; i++)
			setA.add(i);
		System.out.println("setA = " + setA);
		
		for(int i=4; setB.size()<5; i++)
			setB.add(i);
		System.out.println("setB = " + setB);
		
		Iterator it = setA.iterator();
		while(it.hasNext())
			setUnion.add(it.next()); // 합집합
		
		it = setB.iterator();
		while(it.hasNext())
			setUnion.add(it.next()); // 합집합

		/*setUnion.addAll(setA);
		setUnion.addAll(setB);*/ // 메소드를 이용해서 합집합 구하기
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(!setB.contains(obj))
				setDiff.add(obj);
		} // 차집합
		
		/*setDiff.addAll(setA);
		setDiff.removeAll(setB);*/ // 메소드를 이용해서 차집합 구하기
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(setB.contains(obj))
				setIntersection.add(obj); 
		} // 교집합
		
		/*setIntersection.addAll(setA);
		setIntersection.retainAll(setB);*/ // 메소드를 이용해서 교집합 구하기
		
		System.out.println("A ∪ B = " + setUnion);
		System.out.println("A - B = " + setDiff);
		System.out.println("A ∩ B = " + setIntersection);
		

	}

}
