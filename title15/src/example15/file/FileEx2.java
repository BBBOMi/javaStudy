package example15.file;

import java.io.*;

/* 지정한 디렉토리(폴더)에 포함된 파일과 디렉토리의 목록을 보여주는 예제*/
public class FileEx2 { // p.919

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("USAGE : java FileEx2 DIRECTORY");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		
		for(int i=0; i<files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
		}
	}

}
