package example08;

import java.io.File;
import java.util.Scanner;

public class ExceptionEx15 { // p.431

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �̸� �Է� : ");
		String name = input.nextLine();
		
		File f = createFile(name);
		System.out.println(f.getName() + " ������ ���������� �����Ǿ����ϴ�.");

	}
	
	static File createFile(String fileName) {
		try {
			if(fileName == null || fileName.equals(""))
				throw new Exception("���� �̸��� ��ȿ���� �ʽ��ϴ�.");
		} catch(Exception e) {
			fileName = "�������.txt";
		} finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch(Exception e) {
			
		}
	}

}
