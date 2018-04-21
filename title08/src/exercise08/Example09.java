package exercise08;

public class Example09 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
	}
}

class UnsupportedFunctionException extends RuntimeException {
	private final int ERR_CODE;
	
	UnsupportedFunctionException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	
	UnsupportedFunctionException(String msg) {
		this(msg, 100); // ERR_CODE를 100(기본값)으로 초기화
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() { // Exception의 getMessage()를 오버라이딩
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
}
