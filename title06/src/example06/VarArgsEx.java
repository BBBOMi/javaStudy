package example06;

public class VarArgsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println("[" + concatenate(",", new String[] {"1", "2", "3"}));
		System.out.println("[" + concatenate(",", new String[0]) + "]");
		System.out.println("[" + concatenate(",") + "]");
	}
	
	static String concatenate(String delim, String... args) {
		String result = "";
		
		for(String str : args)
			result += str + delim;
		
		return result;
	}
	
	/*static String concatenate(String... args) {
		return concatenate("", args);
	} // 가변 인자를 가지는 메소드는 오버로딩을 하지 않는 것이 좋음
*/
}
