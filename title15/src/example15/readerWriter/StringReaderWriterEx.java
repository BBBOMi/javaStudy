package example15.readerWriter;

import java.io.*;

public class StringReaderWriterEx { // p.903

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputData = "ABCD";
		StringReader input = new StringReader(inputData);
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		try {
		while((data = input.read()) != -1) {
			output.write(data);
		}
		} catch(IOException e) { }
		
		System.out.println("Input Data : " + inputData);
		System.out.println("Output Data : " + output.toString());
		//System.out.println("Output Data : " + output.getBuffer().toString());
	}

}
