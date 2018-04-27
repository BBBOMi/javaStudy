package exercise11;

import java.util.*;
import java.io.*;

public class Exercise14 {
	static ArrayList record = new ArrayList(); // ���� �����͸� ������ ����
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			switch(displayMenu()) {
			case 1:
				inputRecord();
				break;
			case 2:
				displayRecord();
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
		}

	}
	
	// menu�� �����ִ� �޼ҵ�
	static int displayMenu() {
		System.out.println("***********************************");
		System.out.println("*           ���� ���� ���α׷�                       *");
		System.out.println("***********************************");
		System.out.println();
		System.out.println("1. �л����� �Է��ϱ�");
		System.out.println();
		System.out.println("2. �л����� ����");
		System.out.println();
		System.out.println("3. ���α׷� ����");
		System.out.println();
		System.out.print("���ϴ� �޴��� �����ϼ���. (1~3) : ");
		
		int menu = 0;
		
		do {
			try {
				menu = Integer.parseInt(s.nextLine().trim());
				
				if(1 <= menu && menu <= 3) break;
				else throw new Exception();
			} catch(Exception e) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				System.out.print("���ϴ� �޴��� �����ϼ���.(1~3) : ");
			}
		}while(true); // #14_1 ȭ�����κ��� �޴��� �Է¹���
		
		return menu;
	}
	
	static void inputRecord() {
		System.out.println("1. �л����� �Է��ϱ�");
		System.out.println("�̸�, ��, ��ȣ, �����, �����, ���м���'�� ������ ������� �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�.");
	
		while(true) {
			System.out.print(">>");
			
			try {
				String input = s.nextLine().trim();
				
				if(!input.equalsIgnoreCase("q")) {
					Scanner s2 = new Scanner(input).useDelimiter(",");
					record.add(new Student(s2.next(), s2.nextInt(), s2.nextInt(),
							s2.nextInt(), s2.nextInt(), s2.nextInt()));
					System.out.println("���ԷµǾ����ϴ�. �Է��� ��ġ���� q�� �Է��ϼ���.");
				} else return;
			} catch(Exception e) {
				System.out.println("�Է¿����Դϴ�. �̸�, ��, ��ȣ, �����, �����, ���м���'�� ������ �Է��ϼ���. ");
			}
		} // #14_2 �л� �����͸� �Է¹ް� ����
	}
	
	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		
		int length = record.size();
		
		if(length > 0) {
			System.out.println();
			System.out.println("�̸�  ��  ��ȣ  ����  ����  ����  ���  �������  �ݵ��");
			System.out.println("=========================================");
			
			for(int i=0; i<length; i++) {
				Student student = (Student)record.get(i);
				System.out.println(student);
				koreanTotal += student.kor;
				mathTotal += student.math;
				englishTotal += student.eng;
				total += student.total;
			}
			
			System.out.println("=========================================");
			System.out.println("���� : " + koreanTotal + " " + englishTotal
					+ " " + mathTotal + " " + total);
			System.out.println();
		} else {
			System.out.println("=========================================");
			System.out.println("�����Ͱ� �����ϴ�");
			System.out.println("=========================================");
		}
	}

}
