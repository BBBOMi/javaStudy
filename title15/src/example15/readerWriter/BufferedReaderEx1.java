package example15.readerWriter;

import java.io.*;

public class BufferedReaderEx1 { // p.904

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("BufferedReaderEx1.java");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			for(int i=1; (line = br.readLine()) != null; i++) {
				//";"을 포함한 라인을 출력한다
				System.out.println(i + ": " + line);
			}
			
			br.close();
		} catch(IOException e ) {
			e.printStackTrace();
		}

	}

}
