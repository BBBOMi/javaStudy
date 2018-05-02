package example14.stream;

import java.util.*;

public class OptionalEx1 { // p.839-940

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> optStr = Optional.of("abc");
		Optional<Integer> optInt = optStr.map(String::length);
		System.out.println("optStr = " + optStr.get());
		System.out.println("optInt = " + optInt.get());
		
		int  result1 = Optional.of("123")
							.filter(x -> x.length() > 0)
							.map(Integer::parseInt).get();
		
		int result2 = Optional.of("")
							.filter(x -> x.length() > 0)
							.map(Integer::parseInt).orElse(-1);
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		Optional.of("456").map(Integer::parseInt)
				.ifPresent(x -> System.out.printf("result3 = %d%n", x));
		
		OptionalInt optInt1 = OptionalInt.of(0); // 0阑 历厘
		OptionalInt optInt2 = OptionalInt.empty(); // 后 按眉甫 积己
		
		System.out.println(optInt1.isPresent()); // true
		System.out.println(optInt2.isPresent()); // false
		
		System.out.println(optInt1.getAsInt()); // 0
		//System.out.println(optInt2.getAsInt()); // NoSuchElementException
		
		System.out.println("optInt1 = " + optInt1);
		System.out.println("optInt2 = " + optInt2);
		System.out.println("optInt1.equals(optInt2) ? " + optInt1.equals(optInt2));
		
		Optional<String> opt = Optional.ofNullable(null); // null历厘
		Optional<String> opt2 = Optional.empty(); // 后 按眉甫 积己
		
		System.out.println("opt = " + opt);
		System.out.println("opt2 = " + opt2);
		System.out.println("opt.equals(opt2) ? " + opt.equals(opt2)); // true
		
		int result4 = optStrToInt(Optional.of("123"), 0);
		int result5 = optStrToInt(Optional.of(""), 0);
		
		System.out.println("result4 = " + result4);
		System.out.println("result5 = " + result5);
	}
	
	static int optStrToInt(Optional<String> optStr, int defaultValue) {
		try {
			return optStr.map(Integer::parseInt).get();
		} catch (Exception e) {
			return defaultValue;
		}
	}

}
