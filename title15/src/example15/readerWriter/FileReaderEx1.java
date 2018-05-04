package example15.readerWriter;

import java.io.*;

public class FileReaderEx1 { // p.899-900

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String fileName = "test.txt";
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);
			
			int data = 0;
			
			//
			while((data = fis.read()) != -1) {
				System.out.println((char)data); // ÇÑ±Û ±úÁü
			}
			
			System.out.println();
			fis.close();
			
			while((data = fr.read()) != -1) {
				System.out.println((char)data); // Á¤»ó Ãâ·Â
			}
			System.out.println();
			fr.close();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
