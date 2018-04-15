package example08;

import java.io.File;
import java.util.Scanner;

public class ExceptionEx16 { // p.433

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("파일 이름: ");
		String name = input.nextLine();
		
		try {
			File f = createFile(name);
			System.out.println(f.getName() + "파일이 성공적으로 생성");
		} catch(Exception e) {
			System.out.println(e.getMessage() + " 다시 입력");
		}

	}
	
	static File createFile(String fileName) throws Exception {
		if(fileName == null || fileName.equals(""))
			throw new Exception("파일이름이 유효하지 않음");
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}

}
