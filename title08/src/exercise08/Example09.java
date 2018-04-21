package exercise08;

public class Example09 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		throw new UnsupportedFunctionException("�������� �ʴ� ����Դϴ�.", 100);
	}
}

class UnsupportedFunctionException extends RuntimeException {
	private final int ERR_CODE;
	
	UnsupportedFunctionException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	
	UnsupportedFunctionException(String msg) {
		this(msg, 100); // ERR_CODE�� 100(�⺻��)���� �ʱ�ȭ
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() { // Exception�� getMessage()�� �������̵�
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
}
