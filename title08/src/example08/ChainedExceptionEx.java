package example08;

public class ChainedExceptionEx { // p. 446-447

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void install() throws InstallException {
		try {
			startInstall(); // ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�
			copyFiles(); // ���ϵ��� �����Ѵ�
		} catch(SpaceException | MemoryException e) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(e); // InstallException�� ���� ���� ����
			throw ie;
		} finally {
			deleteTempFiles(); // ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) { // ����� ��ġ ������ ������
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		}
		
		if(!enoughMemory()) { // ����� �޸𸮰� ������
			throw new MemoryException("�޸𸮰� �����մϴ�.");
			// throw new RuntimeException(new MemoryException("�޸𸮰� �����մϴ�.");
			/* MemoryException�� Exception�� �ڼ��̹Ƿ� �ݵ�� ����ó���� �ؾ���
			 * �� ���ܸ� �� ����ó�� RunTimeException���� ���θ� unchecked���ܰ� �ȴ�.
			 * ���� startInstall() ����ο� MemoryException�� �������� �ʾƵ� �ȴ�.
			 */
		}
	}
	
	static void copyFiles() { /* ���ϵ��� �����ϴ� �ڵ带 ���´� */ }
	static void deleteTempFiles() { /* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´� */ }
	
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

class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}
