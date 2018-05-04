package example15;

import java.io.*;

public class RandomAccessFileEx2 { // p.913-914

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					// ��ȣ, ����, ����, ����
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
			// readInt()�� ȣ������ �� ���̻� ���� ������ ������ EOFException�� �߻��Ѵ�
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		/* ���X. writeInt()�� �����ϸ鼭 ���� �������� ��ġ�� ���̸��� ���������� �̵��Ǿ��� ����.
		 * �� ������ readInt()�� ȣ�������Ƿ� ������ �պκ��� �ƴ� ������ �κк��� �б� �����Ѵ�.
		 * ������ �ƹ��͵� ���� ���ϰ� EOFException�� �߻��ؼ� ���ѹݺ����� ����� �ȴ�.
		 * �ذ� ���: seek(long pos)�� �̿��ؼ� ���� �������� ��ġ�� �ٽ� ó������ �̵� ��Ų �� readInt() ȣ��
		 */
	}

}
