package exercise05;

import java.util.Scanner;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] words = {
				{"chair", "����"},
				{"computer", "��ǻ��"},
				{"integer", "����"}
		};
		
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i< words.length; i++) {
			System.out.printf("Q%d. %s�� ����? ", i+1, words[i][0]);
			
			String tmp = input.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�. %n%n");
				count++;
			} else
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�. %n%n", words[i][1]);
		}
		
		System.out.println("��ü " + words.length + "���� �� " + count + "���� ���߼̽��ϴ�.");

	}

}
