package example14.lambda;

@FunctionalInterface
interface MyFunction {
	void run(); // public abstract void run();
}

public class LambdaEx1 { // p.799-800
	static void execute(MyFunction f) { // �Ű������� Ÿ���� MyFunction�� �޼ҵ�
		f.run();
	}
	
	static MyFunction getMyFunction() { // ��ȯ Ÿ���� MyFunction�� �޼ҵ�
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ٽ����� MyFunction�� run()�� ����
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		MyFunction f2 = new MyFunction() { // �͸�Ŭ������ fun()�� ����
			public void run() { // public�� �ݵ�� �ٿ��� ��
				System.out.println("f2.run()");
			}
		};
		
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute( () -> System.out.println("run()"));

	}

}
