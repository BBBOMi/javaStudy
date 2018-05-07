package exercise15;

import java.io.*;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("USAGE: java Exercise01 10 FILENAME");
			System.exit(0);
		}
		
		File file = new File(args[1]);
		
		if(!file.exists() || file.isDirectory()) {
			System.out.println(file.getName() + "은/는 디렉토리이거나, 존재하지 않는 파일입니다.");
			System.exit(0);
		}
		
		int lineNum = Integer.parseInt(args[0]);
		
		try {
		FileReader fr = new FileReader(file.getName());
		BufferedReader br = new BufferedReader(fr);
	
		String data = "";
		int count = 1;
		
		while((data = br.readLine()) != null && count <= lineNum) {
			System.out.println(count+ " : " + data);
			count++;
		}
		
		br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}

		// 모범답안
		/*try {
			int lineNum = Integer.parseInt(args[0]);
			String fileName = args[1];
			
			File f = new File(fileName);
			
			if(f.exists() && !f.isDirectory()) {
				BufferedReader br = new BufferedReader(new FileReader(fileName));
				
				String line = "";
				int i = 1;
				
				while((line = br.readLine()) != null && i <= lineNum) {
					System.out.println(i +" : " + line);
					i++;
				}
			} else {
				throw new FileNotFoundException(fileName + "은/는 디렉토리이거나, 존재하지 않는 파일입니다.");
			}
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("USAGE: java Exercise01 10 FILENAME");
		}
*/		
	}

}
