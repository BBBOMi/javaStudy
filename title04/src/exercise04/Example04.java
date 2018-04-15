package exercise04;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1, sum=0;
		
		while(true) {
			int tmp;
			
			if(i%2 == 0)
				tmp = -1 * i;
			else
				tmp = i;
			
			sum += tmp;
			
			if(sum < 100)
				i++;
			else
				break;
		}
		
		System.out.println(i);
		
		
	}

}
