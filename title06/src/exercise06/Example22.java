package exercise06;

public class Example22 {
	static boolean isNumber(String str) {
		if(str == null || str == "")
			return false;

		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(!('0' <= ch && ch <= '9'))
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "123o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = null;
		System.out.println(str + "는 숫자입니까? " + isNumber(str));

	}

}
