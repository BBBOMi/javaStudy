package example15.file;

import java.io.*;

/* FilenameFilter를 구현헤사 특정 조건에 맞는 파일의 목록을 얻는 방법을 구현*/
public class FileEx7 { // p.928

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("USAGE : java FileEx7 pattern");
			System.exit(0);
		}
		
		//String currDir = System.getProperty("user.dir");
		
		File dir = new File("C:\\Users\\BOMI\\workspace\\javaStudy\\title15\\src\\example15\\file");
		final String pattern = args[0];
		
		// String[] list(FilenameFilter filter)
		String[] files = dir.list(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.indexOf(pattern) != -1;
			}
		});
		
		for(int i=0; i<files.length; i++)
			System.out.println(files[i]);

	}

}
