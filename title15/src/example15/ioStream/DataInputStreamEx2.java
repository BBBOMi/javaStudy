package example15.ioStream;

import java.io.*;

public class DataInputStreamEx2 { // p.890-891

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("score.dat");
			dis = new DataInputStream(fis);
			
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		} catch(EOFException e) {
			System.out.println("������ ������ " + sum + "�Դϴ�.");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis != null)
					dis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
