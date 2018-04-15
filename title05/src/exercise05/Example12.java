package exercise05;

import java.util.Scanner;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i< words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
			
			String tmp = input.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다. %n%n");
				count++;
			} else
				System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);
		}
		
		System.out.println("전체 " + words.length + "문제 중 " + count + "문제 맞추셨습니다.");

	}

}
