package exercise11.exercise11_07;

import java.util.*;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		// Student(�̸�, ��, ��ȣ, ��������, ��������, ��������)
		list.add(new Student("���ڹ�", 2, 1, 70, 90, 70));
		list.add(new Student("���ڹ�", 2, 2, 60, 100, 80));
		list.add(new Student("ȫ�浿", 1, 3, 100, 100, 100));
		list.add(new Student("���ü�", 1, 1, 90, 70, 80));
		list.add(new Student("���ڹ�", 1, 2, 80, 80, 90));
		
		Collections.sort(list, new BanNoAscending()); // ���ο� �������� ����(��, ��ȣ)
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}

}