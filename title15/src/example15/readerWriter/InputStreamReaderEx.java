package example15.readerWriter;

import java.io.*;

public class InputStreamReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "";
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("������� OS�� ���ڵ� : " + isr.getEncoding());
			
			do {
				System.out.print("������ �Է��ϼ���. ��ġ�÷��� q�� �Է��ϼ���.> ");
				line = br.readLine();
				System.out.println("�Է��Ͻ� ���� : " + line);
			} while(!line.equalsIgnoreCase("q"));
				
			br.close(); // System.in�� ���� ǥ��������� ���� �ʾƵ� �ȴ�
		} catch(IOException e) { }

	}

}
