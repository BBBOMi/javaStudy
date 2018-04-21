package example08;

public class NewExceptionTest { // p. 440-441

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			startInstall(); // ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�
			copyFiles(); // ���ϵ��� �����Ѵ�
		} catch(SpaceException e) {
			System.out.println("message: " + e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���� �Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
		} catch(MemoryException e) {
			System.out.println("message: " + e.getMessage());
			e.printStackTrace();
			System.gc();
			System.out.println("�ٽ� öġ�� �õ��ϼ���.");
		} finally {
			deleteTempFiles();
		}

	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) // ����� ��ġ ������ ������
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		
		if(!enoughMemory()) // ����� �޸𸮰� ������
			throw new MemoryException("�޸𸮰� �����մϴ�.");
	}
	
	static void copyFiles() {/* ���ϵ��� �����ϴ� �ڵ带 �ۼ�*/ }
	static void deleteTempFiles() { /* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�*/ }

	static boolean enoughSpace() {
		// ��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�
		// Ȯ���� ���� false ����
		return false;
	}
	
	static boolean enoughMemory() {
		// ��ġ�ϴµ� �ʿ��� �޸𸮰����� �ִ��� Ȯ���ϴ� �ڵ带 ���´�
		return true;
	}
}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}
