package exercise15;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Exercise06 {
	static String[] argArr; // 입력한 매개변수를 담기위한 문자열 배열
	static File curDir; // 현재 디렉토리
	
	static {
		try {
			curDir = new File(System.getProperty("user.dir"));
		} catch(Exception e) { }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		while(true) {
			try {
				String prompt  = curDir.getCanonicalPath() + ">>";
				System.out.print(prompt);
				
				// 화면으로부터 라인단위로 입력받는다.
				String input = s.nextLine();
				
				input = input.trim(); // 입력받은 값에서 불필요한 앞뒤 공백을 제거
				argArr = input.split(" +");
				
				String command = argArr[0].trim();
				
				if("".equals(command)) continue;
				
				command = command.toLowerCase(); // 명령어를 소문자로 바꾼다
				
				if(command.equals("q")) System.exit(0); // q 또는 Q를 입력하면 종료
				else if(command.equals("cd")) cd();
				else {
					for(int i=0; i<argArr.length; i++) {
						System.out.println(argArr[i]);
					}
				}
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("입력오류입니다.");
			}
		}

	}
	
	public static void cd() {
		if(argArr.length == 1) {
			System.out.println(curDir);
			return;
		} else if(argArr.length > 2) {
			System.out.println("USAGE: cd directory");
			return;
		}
		
		String subDir = argArr[1];
		
		// #06
		if("..".equals(subDir)) { // 입력된 디렉토리가 ".."이면
			File newDir = curDir.getParentFile(); // 현재 디렉토리의 조상 디렉토리를 얻어서 현재 디렉토리로 저장
			
			if(newDir == null) System.out.println("유효하지 않은 디렉토리입니다.");
			else curDir = newDir; // 조상 디렉토리를 현재 디렉토리로 저장
		
		} else if(".".equals(subDir)) // 입력된 디렉토리가 "."이면
			System.out.println(curDir); // 현재 디렉토리 출력
		
		else {
			File newDir = new File(curDir, subDir);
			// 입력된 디렉토리가 현재 디렉토리의 하위디렉토리인지 확인
			if(newDir.exists() && newDir.isDirectory())
				curDir = newDir; // 맞다면 현재 디렉토리를 입력된 디렉토리로 변경
			else
				System.out.println("유효하지 않은 디렉토리입니다.");
		}
	}

}
