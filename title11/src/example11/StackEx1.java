package example11;

import java.util.Stack;

public class StackEx1 { // p.608-609
	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		goURL("1. ����");
		goURL("2. ����");
		goURL("3. ���̹�");
		
		printStatus();
		
		goBack();
		System.out.println("= �ڷΰ��� ��ư�� ���� �� =");
		printStatus();
		
		goBack();
		System.out.println("= '�ڷ�' ��ư�� ���� �� =");
		printStatus();
		
		goForward();
		System.out.println("= '������' ��ư�� ���� �� =");
		printStatus();
		
		goURL("codechobo.com");
		System.out.println("= ���ο� �ּҷ� �̵� =");
		printStatus();

	}
	
	public static void printStatus() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("���� ȭ���� '" + back.peek() + "' �Դϴ�.");
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!(forward.empty()))
			forward.clear();
	}
	
	public static void goForward() {
		if(!forward.isEmpty())
			back.push(forward.pop());
	}
	
	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop());
	}

}