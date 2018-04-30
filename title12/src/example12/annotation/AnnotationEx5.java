package example12.annotation;

import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111") // ��ȿ���� ���� ������̼��� ���õȴ�
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "180430", hhmmss = "153736")) // ���� ���� �͵��� �ݵ�� �� ����
public class AnnotationEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<AnnotationEx5> cls = AnnotationEx5.class;
		
		TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
		// @TestInfo�� ������ ���� �� ����
		System.out.println("anno.testedBy() = " + anno.testedBy());
		System.out.println("anno.testDate().yymmdd() = " + anno.testDate().yymmdd());
		System.out.println("ano.testDate().hhmmss() = " + anno.testDate().hhmmss());
		System.out.println("anno.testDate() = " + anno.testDate());
		
		for(String str : anno.testTools())
			System.out.println("testTools = " + str);

		System.out.println();
		
		// AnnnotationEx5�� ����� ��� ������̼��� �����´�
		Annotation[] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr)
			System.out.println(a);
	}

}

@Retention(RetentionPolicy.RUNTIME) // ���� �ÿ� ��밡���ϵ��� ����
@interface TestInfo {
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME) // ���� �ÿ� ��밡���ϵ��� ����
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType {FIRST, FINAL}
