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
			startInstall(); // 프로그램 설치에 필요한 준비를 한다
			copyFiles(); // 파일들을 복사한다
		} catch(SpaceException | MemoryException e) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(e); // InstallException의 원인 예외 지정
			throw ie;
		} finally {
			deleteTempFiles(); // 프로그램 설치에 사용된 임시파일들을 삭제한다
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) { // 충분한 설치 공간이 없으면
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		
		if(!enoughMemory()) { // 충분한 메모리가 없으면
			throw new MemoryException("메모리가 부족합니다.");
			// throw new RuntimeException(new MemoryException("메모리가 부족합니다.");
			/* MemoryException은 Exception의 자손이므로 반드시 예외처리를 해야함
			 * 이 예외를 위 문장처럼 RunTimeException으로 감싸면 unchecked예외가 된다.
			 * 따라서 startInstall() 선언부에 MemoryException을 선언하지 않아도 된다.
			 */
		}
	}
	
	static void copyFiles() { /* 파일들을 복사하는 코드를 적는다 */ }
	static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다 */ }
	
	static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다
		// 확인을 위해 false 리턴
		return false;
	}
	
	static boolean enoughMemory() {
		// 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다
		return true;
	}
}

class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}
