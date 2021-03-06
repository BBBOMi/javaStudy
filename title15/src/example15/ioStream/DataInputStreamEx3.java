package example15.ioStream;

import java.io.*;

/* DataInputStreamEx2 를 try-with-resources문을 이용하여 변경*/
public class DataInputStreamEx3 { // p.892

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int score = 0;
		
		try(FileInputStream fis = new FileInputStream("score.dat");
				DataInputStream dis = new DataInputStream(fis)) {
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		} catch(EOFException e) {
			System.out.println("점수의 총합은 " + sum + "입니다");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
