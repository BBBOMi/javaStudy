package exercise08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer = (int)(Math.random() * 100) + 1;
		// 1~100 ������ ������ ���� �� answer�� �����Ѵ�
		int input = 0; // ����� �Է��� ������ ����
		int count = 0; // �õ�Ƚ���� ���� ���� ����
		
		do {
			count++;
			
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			
			try {
				input = new Scanner(System.in).nextInt();
			} catch(InputMismatchException e) {
				System.out.print("��ȿ���� ���� ���Դϴ�. ");
				System.out.println("�ٽ� ���� �Է����ּ���.");
				
				continue;
			}
			
			if(answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if(answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� " + count + "�� �Դϴ�.");
				break;
			}
			
		}while(true);
	}

}
