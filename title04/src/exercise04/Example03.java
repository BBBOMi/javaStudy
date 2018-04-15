package exercise04;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0, sum=0;
		
		for(int i=10; i>0; i--) {
			for(int j=1; j<=i; j++) {
				num += j;
			}
			sum += num;
		}
		
		System.out.println(sum);
	}

}
