package example15;

import java.io.*;

public class StandardIOEx3 { // p.910

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("test.txt");
			ps = new PrintStream(fos);
			
			System.setOut(ps); // System.out�� ��´���� test.txt���Ϸ� ����
		} catch(FileNotFoundException e) {
			System.err.println("File not found");
		}
		
		System.out.println("Hello by System.out");
		System.err.println("Hello by System.err");
	}

}
