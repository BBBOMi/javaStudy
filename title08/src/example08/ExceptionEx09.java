package example08;

public class ExceptionEx09 { // p.425

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("고의로 발생시켰음"); // 예외 생성, 예외 메세지 입력
			throw e; // 예외 발생
			// throw new Exception("고의로 발생시켰음"); // 위의 두줄 한줄로 줄일 수 있음			
		} catch(Exception e) {
			System.out.println("message: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");

	}

}
