package exercise05;

import java.util.Scanner;

public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();
			
			for(int j=0; j<question.length; j++) {
				int index = (int)(Math.random() * question.length);
				char tmp = question[j];
				question[j] = question[index];
				question[index] = tmp;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요. ", i+1, new String(question));
			
			String answer = input.nextLine();
			
			if(words[i].equals(answer.trim())) {
				System.out.println("맞았습니다");
				System.out.println();
			} else {
				System.out.println("틀렸습니다.");
				System.out.println();
			}
		}

	}

}
