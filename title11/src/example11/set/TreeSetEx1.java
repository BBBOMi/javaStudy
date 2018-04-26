package example11.set;

import java.util.*;

public class TreeSetEx1 { // p.642

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc"); set.add("alien"); set.add("bat");
		set.add("car"); set.add("Car"); set.add("disc");
		set.add("dance"); set.add("dZZZZ"); set.add("dzzzz");
		set.add("elephant"); set.add("elevator"); set.add("fan");
		set.add("flower");
		
		System.out.println(set); // 문자 정렬 기준: 문자의 코드값(공백, 숫자, 대문자, 소문자) / 오름차순 기준
		System.out.println("range search: from " + from + " to " + to);
		System.out.println("result1: " + set.subSet(from, to));
		System.out.println("result2: " + set.subSet(from, to + "zzz"));

	}

}
