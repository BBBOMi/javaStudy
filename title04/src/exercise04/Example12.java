package exercise04;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int i=2, j=1, count=0;
		
		while(i < 10) {
			System.out.print(i + "*" + j + "=" + i*j + "     " );
			//i++;
			
			if(count != 0 && count%3==0) {
				System.out.println();
				System.out.println();
				System.out.println();
				j = 1;
			}
			
			else {
			if((i-1)%3 == 0) {
				System.out.println();
				j++;
				i = 2;
				count++;
			}
			}
			
			i++;
		}*/
		
		for(int i=1; i<=9; ) {
			for(int j=1; j<=3; j++) {
				for(int k=2; k<=9; k++) {
					System.out.print(k + "*" + j + "=" + k*j + "     ");
					
					if((k-1)%3 == 0) {
						System.out.println();
						i++;
						break;
					}
				}
				
				if(j==3)
					j=1;
				
			}
		}
		
		
	}

}
