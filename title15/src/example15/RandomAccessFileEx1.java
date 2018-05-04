package example15;

import java.io.*;

public class RandomAccessFileEx1 { // p.912-913

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
			System.out.println("���� �������� ��ġ: " + raf.getFilePointer());
			raf.writeInt(100); // int�� 4byte
			System.out.println("���� �������� ��ġ: " + raf.getFilePointer());
			raf.writeLong(100L); // long�� 8byte
			System.out.println("���� �������� ��ġ: " + raf.getFilePointer());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
