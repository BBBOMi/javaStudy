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
		
		System.out.println("= stack의 가장 최근 데이터 =");
		System.out.println(stack.peek());
		System.out.println("= stack의 가장 최근 데이터 삭제 =");
		System.out.println(stack.pop() + " -> 삭제");
		
		System.out.println("B의 위치: " + stack.search("B"));
			
		System.out.println("B의 위치까지 삭제");
		int index = stack.search("B");
		for(int i=0; i<index; i++)
			System.out.println(stack.pop() + " -> 삭제");
		
		System.out.println("stack에 존재하는 가장 최근 데이터");
		System.out.println(stack.peek());
	}

}
