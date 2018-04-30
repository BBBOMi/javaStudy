package example12.annotation;

import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111") // 유효하지 않은 어노테이션은 무시된다
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "180430", hhmmss = "153736")) // 값이 없는 것들은 반드시 값 지정
public class AnnotationEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<AnnotationEx5> cls = AnnotationEx5.class;
		
		TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
		// @TestInfo의 정보를 얻을 수 있음
		System.out.println("anno.testedBy() = " + anno.testedBy());
		System.out.println("anno.testDate().yymmdd() = " + anno.testDate().yymmdd());
		System.out.println("ano.testDate().hhmmss() = " + anno.testDate().hhmmss());
		System.out.println("anno.testDate() = " + anno.testDate());
		
		for(String str : anno.testTools())
			System.out.println("testTools = " + str);

		System.out.println();
		
		// AnnnotationEx5에 적용된 모든 어노테이션을 가져온다
		Annotation[] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr)
			System.out.println(a);
	}

}

@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용가능하도록 지정
@interface TestInfo {
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용가능하도록 지정
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType {FIRST, FINAL}
