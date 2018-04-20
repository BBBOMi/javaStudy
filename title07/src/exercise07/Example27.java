package exercise07;

class OC {
	int value = 10; // OC.this.vlaue
	
	class IC {
		int value = 20; // this.value
		
		void method1() {
			int value = 30; // value
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(OC.this.value);
		}
	}
}

public class Example27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OC o = new OC();
		OC.IC inner = o.new IC();
		
		inner.method1();

	}

}
