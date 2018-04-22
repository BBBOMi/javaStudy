package example09;

public class StringBufferEx1 { // p. 479

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb2 ? " + (sb == sb2));
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		/* StringBuffer클래스는 equals메소드를 오버라이딩 하지 않아서
		 * StringBuufer클래스의 equals메소드를 사용해도 등가비교연산자(==)로 비교한 것과 같은 결과를 얻음
		 */
		
		String s = sb.toString();
		String s2 = sb2.toString();
		// StringBuffer인스턴스에 담긴 문자열을 비교하기 위해서 toString()을 호출해 String인스턴스를 얻음
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));

	}

}
