package example11.set;

import java.util.*;

public class HashSetEx1 { // p.632
	/* Set은 중복된 값 저장 X - 객체를 추가할 때 HashSet에 이미 같은 객체가 있다면 중복으로 간주, return: false
	 * "1"과 Integer(1)은 서로 다른 객체이므로 중복으로 간주하지 않음("4"와 '4'도 마찬가지)
	 * 순서를 유지하지 않기 때문에 저장한 순서와 다를 수 있음
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objArr = {"1", new Integer(1), "3", "3", "2", "2", "4", '4', "4" };
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		
		System.out.println(set);
	}

}
