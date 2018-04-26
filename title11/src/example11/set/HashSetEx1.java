package example11.set;

import java.util.*;

public class HashSetEx1 { // p.632
	/* Set�� �ߺ��� �� ���� X - ��ü�� �߰��� �� HashSet�� �̹� ���� ��ü�� �ִٸ� �ߺ����� ����, return: false
	 * "1"�� Integer(1)�� ���� �ٸ� ��ü�̹Ƿ� �ߺ����� �������� ����("4"�� '4'�� ��������)
	 * ������ �������� �ʱ� ������ ������ ������ �ٸ� �� ����
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objArr = {"1", new Integer(1), "3", "3", "2", "2", "4", '4', "4" };
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		
		System.out.println(set);
	}

}
