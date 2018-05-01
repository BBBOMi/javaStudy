package example14.lambda;

@FunctionalInterface
interface MyFunction2 {
	void myMethod(); // public abstract void myMethod();
}

public class LambdaEx2 { // p.800-801

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction2 f = () -> {}; // MyFunction f = (MyFunction)(() -> {});
		Object obj = (MyFunction2)(() -> {}); // Object타입으로 형변환이 생략됨
		String str = ((Object)(MyFunction2)(() -> {})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
		//System.out.println(() -> {}); // 에러. 람다식은 Object타입으로 형변환 안됨
		System.out.println((MyFunction2)() -> {});
		//System.out.println((MyFunction2)(() -> {}).toString()); // 에러.
		System.out.println(((Object)(MyFunction2)(() -> {})).toString());

	}

}
