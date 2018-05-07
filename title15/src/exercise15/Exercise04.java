package exercise15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length < 2) {
			System.out.println("USAGE: java Exercise04 MERGE_FILENAME FILENAME1 FILENAME2 ...");
			System.exit(0);
		}
		
		try {
			Vector v = new Vector();
			
			for(int i=0; i<args.length; i++) {
				File f = new File(args[i]);
				
				if(f.exists()) {
					v.add(new FileInputStream(args[i]));
				} else {
					System.out.println(args[i] + " - 존재하지 않는 파일입니다.");
					System.exit(0);
				}
			}
			
			SequenceInputStream input = new SequenceInputStream(v.elements());
			FileOutputStream output = new FileOutputStream(args[0]);
			
			int data = 0;
			
			while((data = input.read()) != -1) {
				output.write(data);
			}
		} catch(IOException e) { e.printStackTrace(); }

	}

}
