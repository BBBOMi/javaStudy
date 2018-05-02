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
	public Supplier<StringBuilder> supplier() { // 작업 결과를 저장할 공간을 제공
		return () -> new StringBuilder();
		// return StringBuilder::new;
	}
	
	@Override
	public BiConsumer<StringBuilder, String> accumulator() { // 스트림의 요소를 수집할 방법을 제공
		return (sb, s) -> sb.append(s);
		// return StringBuilder::append;
	}
	
	@Override
	public Function<StringBuilder, String> finisher() { // 결과를 최종적으로 변환할 방법을 제공
		return sb -> sb.toString();
		// return StringBuilder::toString;
	}
	
	@Override
	public BinaryOperator<StringBuilder> combiner() { // 두 저장공간을 병합할 방법을 제공
		return (sb, sb2) -> sb.append(sb2);
		// return StringBuilder::append;
	}
	
	@Override
	public Set<Characteristics> characteristics() { // 컬렉터가 수행하는 작업의 속성에 대한 정보를 제공
		return Collections.emptySet(); // 지정할 특성이 없는 경우 비어있는 Set을 반환
	}
}
