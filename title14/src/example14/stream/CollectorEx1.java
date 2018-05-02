package example14.stream;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class CollectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"aaa", "bbb", "ccc" };
		Stream<String> strStream = Stream.of(strArr);
		
		String result = strStream.collect(new ConcatCollector());
		
		System.out.println(Arrays.toString(strArr));
		System.out.println("result = " +  result);
	}

}

class ConcatCollector implements Collector<String, StringBuilder, String> {
	@Override
	public Supplier<StringBuilder> supplier() { // �۾� ����� ������ ������ ����
		return () -> new StringBuilder();
		// return StringBuilder::new;
	}
	
	@Override
	public BiConsumer<StringBuilder, String> accumulator() { // ��Ʈ���� ��Ҹ� ������ ����� ����
		return (sb, s) -> sb.append(s);
		// return StringBuilder::append;
	}
	
	@Override
	public Function<StringBuilder, String> finisher() { // ����� ���������� ��ȯ�� ����� ����
		return sb -> sb.toString();
		// return StringBuilder::toString;
	}
	
	@Override
	public BinaryOperator<StringBuilder> combiner() { // �� ��������� ������ ����� ����
		return (sb, sb2) -> sb.append(sb2);
		// return StringBuilder::append;
	}
	
	@Override
	public Set<Characteristics> characteristics() { // �÷��Ͱ� �����ϴ� �۾��� �Ӽ��� ���� ������ ����
		return Collections.emptySet(); // ������ Ư���� ���� ��� ����ִ� Set�� ��ȯ
	}
}
