package example12.enumEx;

public class EnumEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		// static E values(): ������ ����� �̸����� ���ڿ� ����� ���� ������ ���� �� �ִ�
		Direction d3 = Direction.valueOf(Direction.class, "EAST");
		// static T valueOf(Class<T> enumType, String name): ������ ���������� name�� ��ġ�ϴ� ������ ����� ��ȯ

		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		
		System.out.println("d1 == d2 ? " + (d1 == d2));
		System.out.println("d1 == d3 ? " + (d1 == d3));
		System.out.println("dq.equls(d3) ? " + d1.equals(d3));
		//System.out.println("d2 > d3 ? " + (d1 > d3)); // ����. ������ ����� �񱳿����� ���Ұ�
		System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));
		
		switch(d1) {
		case EAST: // Directon.EAST��� �� �� ����
			System.out.println("The direction is EAST.");
			break;
			
		case SOUTH:
			System.out.println("The direction is SOUTH.");
			break;
			
		case WEST:
			System.out.println("The direction is WEST.");
			break;
			
		case NORTH:
			System.out.println("The direction is NORTH.");
			break;
			
		default:
			System.out.println("Invalid dorection");
			break;
		}
		
		Direction[] dArr = Direction.values();
		
		for(Direction d : dArr) // for(Direction d : Direction.values())
			System.out.printf("%s = %d%n", d.name(), d.ordinal());
		// String name() : ������ ����� �̸��� ���ڿ��� ��ȯ�Ѵ�
		// int ordinal() : ������ ����� ���ǵ� ������ ��ȯ�Ѵ�(0���� ����)
	}

}
