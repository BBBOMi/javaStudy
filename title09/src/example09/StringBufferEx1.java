package example09;

public class StringBufferEx1 { // p. 479

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb2 ? " + (sb == sb2));
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		/* StringBufferŬ������ equals�޼ҵ带 �������̵� ���� �ʾƼ�
		 * StringBuuferŬ������ equals�޼ҵ带 ����ص� ��񱳿�����(==)�� ���� �Ͱ� ���� ����� ����
		 */
		
		String s = sb.toString();
		String s2 = sb2.toString();
		// StringBuffer�ν��Ͻ��� ��� ���ڿ��� ���ϱ� ���ؼ� toString()�� ȣ���� String�ν��Ͻ��� ����
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));

	}

}
