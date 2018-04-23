package exercise09;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		System.out.println("aa�� " + stringCount(src, "aa") + "�� ã�ҽ��ϴ�.");
	}
	
	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}

	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		
		if(key == null || key.length() == 0) return 0;
		
		while(src.indexOf(key, pos) != -1) {
			count++;
			
			index = src.indexOf(key, pos);
			pos = index + key.length(); 
		}
		
		return count;
	}
}