package example07;

public class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		// int siv = outerIv; // static class는 외부 클래스의 instance 멤버에 접근할 수 없다.
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			
			int liv3 = lv;
			int liv4 = LV;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
