package example11.list;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector { // p.606-607
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	
	public boolean empty() {
		return size() == 0;
	}
	
	public Object peek() {
		int len = size();
		
		if(len == 0)
			throw new EmptyStackException();
		return elementAt(len-1);
	}
	
	public Object pop() {
		Object obj = peek();
		
		removeElementAt(size()-1);
		return obj;
	}
	
	public int search(Object o) {
		int i = lastIndexOf(o);
		
		if(i >= 0)
			return size() - i;
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack = new MyStack();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		
		System.out.println("= stack�� ���� �ֱ� ������ =");
		System.out.println(stack.peek());
		System.out.println("= stack�� ���� �ֱ� ������ ���� =");
		System.out.println(stack.pop() + " -> ����");
		
		System.out.println("B�� ��ġ: " + stack.search("B"));
			
		System.out.println("B�� ��ġ���� ����");
		int index = stack.search("B");
		for(int i=0; i<index; i++)
			System.out.println(stack.pop() + " -> ����");
		
		System.out.println("stack�� �����ϴ� ���� �ֱ� ������");
		System.out.println(stack.peek());
	}

}
