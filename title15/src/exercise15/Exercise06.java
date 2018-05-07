package exercise15;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Exercise06 {
	static String[] argArr; // �Է��� �Ű������� ������� ���ڿ� �迭
	static File curDir; // ���� ���丮
	
	static {
		try {
			curDir = new File(System.getProperty("user.dir"));
		} catch(Exception e) { }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		while(true) {
			try {
				String prompt  = curDir.getCanonicalPath() + ">>";
				System.out.print(prompt);
				
				// ȭ�����κ��� ���δ����� �Է¹޴´�.
				String input = s.nextLine();
				
				input = input.trim(); // �Է¹��� ������ ���ʿ��� �յ� ������ ����
				argArr = input.split(" +");
				
				String command = argArr[0].trim();
				
				if("".equals(command)) continue;
				
				command = command.toLowerCase(); // ��ɾ �ҹ��ڷ� �ٲ۴�
				
				if(command.equals("q")) System.exit(0); // q �Ǵ� Q�� �Է��ϸ� ����
				else if(command.equals("cd")) cd();
				else {
					for(int i=0; i<argArr.length; i++) {
						System.out.println(argArr[i]);
					}
				}
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("�Է¿����Դϴ�.");
			}
		}

	}
	
	public static void cd() {
		if(argArr.length == 1) {
			System.out.println(curDir);
			return;
		} else if(argArr.length > 2) {
			System.out.println("USAGE: cd directory");
			return;
		}
		
		String subDir = argArr[1];
		
		// #06
		if("..".equals(subDir)) { // �Էµ� ���丮�� ".."�̸�
			File newDir = curDir.getParentFile(); // ���� ���丮�� ���� ���丮�� �� ���� ���丮�� ����
			
			if(newDir == null) System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			else curDir = newDir; // ���� ���丮�� ���� ���丮�� ����
		
		} else if(".".equals(subDir)) // �Էµ� ���丮�� "."�̸�
			System.out.println(curDir); // ���� ���丮 ���
		
		else {
			File newDir = new File(curDir, subDir);
			// �Էµ� ���丮�� ���� ���丮�� �������丮���� Ȯ��
			if(newDir.exists() && newDir.isDirectory())
				curDir = newDir; // �´ٸ� ���� ���丮�� �Էµ� ���丮�� ����
			else
				System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
		}
	}

}
