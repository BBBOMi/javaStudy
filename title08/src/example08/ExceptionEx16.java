package example08;

import java.io.File;
import java.util.Scanner;

public class ExceptionEx16 { // p.433

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �̸�: ");
		String name = input.nextLine();
		
		try {
			File f = createFile(name);
			System.out.println(f.getName() + "������ ���������� ����");
		} catch(Exception e) {
			System.out.println(e.getMessage() + " �ٽ� �Է�");
		}

	}
	
	static File createFile(String fileName) throws Exception {
		if(fileName == null || fileName.equals(""))
			throw new Exception("�����̸��� ��ȿ���� ����");
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}

}
