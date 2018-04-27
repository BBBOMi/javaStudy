package exercise11.exercise11_09;

import java.util.*;

public class Exercise09 {
	public static void calculateClassRank(List list) {
		//���� �ݺ� �������� ������������ ����
		Collections.sort(list, new ClassTotalComparator());
		
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for(int i=0, n=0; i<length; i++, n++) {
			Student s = (Student)list.get(i);
			
			if(s.ban != prevBan) {
				prevBan = -1;
				prevTotal = -1;
				n = 0;
			}
			
			if(s.total == prevTotal) s.classRank = prevRank;
			else s.classRank = n + 1;
			
			prevBan = s.ban;
			prevTotal = s.total;
			prevRank = s.classRank;
		}
	}
	
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // �������� ������������ ����
		
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for(int i=0; i<length; i++) {
			Student s = (Student)list.get(i);
			
			if(s.total == prevTotal) s.schoolRank = prevRank;
			else s.schoolRank = i + 1;
			
			prevRank = s.schoolRank;
			prevTotal = s.total;
		}
	}


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
		calculateClassRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
			// name, ban, no, kor, eng, math, getTotal(), getAverage(), schoolRank, classRank
			// ������ ���
	}

}
