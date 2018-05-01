package example14.lambda;

@FunctionalInterface
interface MyFunction2 {
	void myMethod(); // public abstract void myMethod();
}

public class LambdaEx2 { // p.800-801

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction2 f = () -> {}; // MyFunction f = (MyFunction)(() -> {});
		Object obj = (MyFunction2)(() -> {}); // ObjectŸ������ ����ȯ�� ������
		String str = ((Object)(MyFunction2)(() -> {})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
		//System.out.println(() -> {}); // ����. ���ٽ��� ObjectŸ������ ����ȯ �ȵ�
		System.out.println((MyFunction2)() -> {});
		//System.out.println((MyFunction2)(() -> {}).toString()); // ����.
		System.out.println(((Object)(MyFunction2)(() -> {})).toString());

	}

}
