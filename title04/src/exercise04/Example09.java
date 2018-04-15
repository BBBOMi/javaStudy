package exercise04;

public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			int num = str.charAt(i) - 48;
			
			sum += num;
		}
		
		System.out.println("sum=" + sum);

	}

}
