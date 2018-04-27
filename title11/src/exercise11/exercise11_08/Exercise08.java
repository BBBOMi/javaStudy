package exercise11.exercise11_08;

import java.util.*;

public class Exercise08 {
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // ���� list�� �������� ������������ �����Ѵ�
		
		int prevRank = -1; // ���� �������
		int prevTotal = -1; // ���� ����
		int length = list.size();
		
		for(int i=0; i<length; i++) {
			Student s = (Student)list.get(i);

			if(s.total == prevTotal)
				s.schoolRank = prevRank; // ������ ó��
			else
				s.schoolRank = i + 1;

			prevRank = s.schoolRank;
			prevTotal = s.total;
		}
	} // #08_2 ������ �������� �� �л��� ������� ���

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		// Student(�̸�, ��, ��ȣ, ��������, ��������, ��������)
		list.add(new Student("���ڹ�", 2, 1, 70, 90, 70));
		list.add(new Student("���ڹ�", 2, 2, 60, 100, 80));
		list.add(new Student("ȫ�浿", 1, 3, 100, 100, 100));
		list.add(new Student("���ü�", 1, 1, 90, 70, 80));
		list.add(new Student("���ڹ�", 1, 2, 80, 80, 90));
		
		calculateSchoolRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
			// name, ban, no, kor, eng, math, getTotal(), getAverage(), schoolRank
			// ������ ���

	}

}
