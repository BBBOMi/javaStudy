package example08;

public class ExceptionEx08 { // p.422

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(ArithmeticException  | NullPointerException ne) {
			if(ne instanceof ArithmeticException) {
				ne.printStackTrace();
				//System.out.println("Arithmetic message : " + ne.getMessage());
			} else
				System.out.println("NullPointer message : " + ne.getMessage());
				
		}
		
		System.out.println(6);

	}

}
