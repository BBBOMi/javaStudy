package exercise14;

import java.util.Random;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Random().ints(1, 46) // 1~45������ ����(46�� ���� �ȵ�)
					.distinct() // �ߺ� ����
					.limit(6) // 6����
					.sorted() // ����
					.forEach(System.out::println); // ȭ�鿡 ���
	}

}
