package example15;

import java.io.*;

public class RandomAccessFileEx1 { // p.912-913

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
			System.out.println("파일 포인터의 위치: " + raf.getFilePointer());
			raf.writeInt(100); // int는 4byte
			System.out.println("파일 포인터의 위치: " + raf.getFilePointer());
			raf.writeLong(100L); // long은 8byte
			System.out.println("파일 포인터의 위치: " + raf.getFilePointer());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
