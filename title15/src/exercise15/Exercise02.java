package exercise15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("USAGE: java Exercise02 FILENAME");
			System.exit(0);
		}

		String fileName = args[0];
		
		try {
			FileInputStream input = new FileInputStream(fileName);
			PrintStream output = new PrintStream(System.out);
			
			int data = 0;
			int i = 0;
			
			while((data = input.read()) != -1) {
				output.printf("%02x ", data);
				if(++i % 16 == 0) output.println();
			}
			
			input.close();
			output.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
