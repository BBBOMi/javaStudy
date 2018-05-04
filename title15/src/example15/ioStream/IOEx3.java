package example15.ioStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx3 { // p.877

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		
		try {
			while(input.available() > 0) { // int available() : 스트림으로부터 읽어 올 수 있는 데이터의 크기를 반환
				input.read(temp);
				output.write(temp);
				//System.out.println("temp : " + Arrays.toString(temp));
				
				outSrc = output.toByteArray();
				printArrays(temp, outSrc);
			}
		} catch(IOException e) { }
	}
	
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("output Source : " + Arrays.toString(outSrc));
	}

}
