package example08;

public class ExceptionEx09 { // p.425

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("���Ƿ� �߻�������"); // ���� ����, ���� �޼��� �Է�
			throw e; // ���� �߻�
			// throw new Exception("���Ƿ� �߻�������"); // ���� ���� ���ٷ� ���� �� ����			
		} catch(Exception e) {
			System.out.println("message: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ���� ����");

	}

}
