package example15;

import java.io.FileInputStream;
import java.io.IOException;

public class FileViewer { // p.879

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(args[0]);
		int data = 0;
		
		while((data = fis.read()) != -1) {
			char c = (char)data;
			System.out.print(c);
		}

	}

}
