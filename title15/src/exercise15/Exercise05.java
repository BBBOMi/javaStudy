package exercise15;

import java.io.*;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("USAGE : Exercise05 TAGET_FILE RESULT_FILE");
			System.exit(0);
		}
		
		String inputFile = args[0];
		String outputFile = args[1];
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(inputFile));
			HtmlTagFilterWriter output = new HtmlTagFilterWriter(new FileWriter(outputFile));
			
			int ch = 0;
			
			while((ch = input.read()) != -1) {
				output.write(ch);
			}
			
			input.close();
			output.close();
		} catch(IOException e) { }
	}
}

class HtmlTagFilterWriter extends FilterWriter {
	StringWriter tmp = new StringWriter();
	boolean inTag = false;
	
	HtmlTagFilterWriter(Writer out) {
		super(out);
	}
	
	public void write(int c) throws IOException {
		if(c == '<') inTag = true;
		else if(c == '>') {
			inTag = false;
			tmp = new StringWriter();
			return;
		}
		
		if(inTag) tmp.write(c);
		else out.write(c);
	}
	
	public void close() throws IOException {
		out.write(tmp.toString());
		super.close();
	}
}
