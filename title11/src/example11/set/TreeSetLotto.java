package example11.set;

import java.util.*;

public class TreeSetLotto { // p.641

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new TreeSet();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(num);
		}
		
		System.out.println(set); // TreeSet�� ������ �� �̹� �����ϱ� ������
								// �о�ö� ���� ������ �ʿ䰡 ����
	}

}
