package example15.file;

import java.io.File;
import java.io.FilenameFilter;

/* ������ Ȯ���ڸ� ���� ������ ����*/
public class FileEx8 { // p.929
	static int deletedFiles = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("USAGE : java FileEx8 Extension");
			System.exit(0);
		}
		
		String currDir = System.getProperty("user.dir");
		
		File dir = new File(currDir);
		String ext = "." + args[0];
		
		delete(dir, ext);
		System.out.println(deletedFiles + "���� ������ �����Ǿ����ϴ�.");
	}
	
	public static void delete(File dir, String ext) {
		File[] files = dir.listFiles();
		
		for(int i=0; i<files.length; i++) {
			if(files[i].isDirectory())
				delete(files[i], ext);
			else {
				String filename = files[i].getName();
				
				if(filename.endsWith(ext)) {
					System.out.print(filename);
					if(files[i].delete()) {
						System.out.println(" - ���� ����");
						deletedFiles++;
					} else
						System.out.println(" - ���� ����");
				}
			}
		}
	}

}
