package example15;

import java.io.*;

public class RandomAccessFileEx2 { // p.913-914

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					// 번호, 국어, 영어, 수학
		int[] score = {1, 100, 90, 90,
						2, 70, 90, 100,
						3, 100, 100, 100,
						4, 70, 60, 80,
						5, 70, 90, 100
		};
		
		try {
			RandomAccessFile raf = new RandomAccessFile("score2.dat", "rw");
			for(int i=0; i<score.length; i++) {
				raf.writeInt(score[i]);
			}
			//raf.seek(0);
			while(true) {
				System.out.println(raf.readInt());
			}
		} catch(EOFException e) {
			// readInt()를 호출했을 때 더이상 읽을 내용이 없으면 EOFException이 발생한다
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		/* 출력X. writeInt()를 수행하면서 파일 포인터의 위치가 파이르이 마지막으로 이동되었기 때문.
		 * 그 다음에 readInt()를 호출했으므로 파일의 앞부분이 아닌 마지막 부분부터 읽기 시작한다.
		 * 때문에 아무것도 읽지 못하고 EOFException이 발생해서 무한반복문을 벗어나게 된다.
		 * 해결 방법: seek(long pos)를 이용해서 파일 포인터의 위치를 다시 처음으로 이동 시킨 후 readInt() 호출
		 */
	}

}
