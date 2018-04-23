package exercise09;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullPath = "c:\\jdk1.8\\work\\pathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		int index = fullPath.lastIndexOf("\\");
		path = fullPath.substring(0, index);
		fileName = fullPath.substring(index + 1);
		
		System.out.println("fullPath: " + fullPath);
		System.out.println("path: " + path);
		System.out.println("fileName: " + fileName);

	}

}
