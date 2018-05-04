package example15;

import java.io.*;

/* "score2.dat"파일의 국어 점수의 합 */
public class RandomAccessFIleEx3 { // p.914

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		try {
			RandomAccessFile raf = new RandomAccessFile("score2.dat", "r");
			int i = 4;
			
			while(true) {
				raf.seek(i);
				sum += raf.readInt();
				i += 16; // 다음 국어 점수를 읽기 위한 포인터 증가
			}
		} catch(EOFException e) {
			System.out.println("sum : " + sum);
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
