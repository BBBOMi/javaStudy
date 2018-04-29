package example12.enumEx;

public class EnumEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		// static E values(): 열거형 상수의 이름으로 문자열 상수에 대한 참조를 얻을 수 있다
		Direction d3 = Direction.valueOf(Direction.class, "EAST");
		// static T valueOf(Class<T> enumType, String name): 지정된 열거형에서 name과 일치하는 열거형 상수를 반환

		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		
		System.out.println("d1 == d2 ? " + (d1 == d2));
		System.out.println("d1 == d3 ? " + (d1 == d3));
		System.out.println("dq.equls(d3) ? " + d1.equals(d3));
		//System.out.println("d2 > d3 ? " + (d1 > d3)); // 에러. 열거형 상수에 비교연산자 사용불가
		System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));
		
		switch(d1) {
		case EAST: // Directon.EAST라고 쓸 수 없다
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
		// String name() : 열거형 상수의 이름을 문자열로 반환한다
		// int ordinal() : 열거형 상수가 정의된 순서를 반환한다(0부터 시작)
	}

}
