package example10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class NewTimeEx1 { // p.559

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today = LocalDate.now(); // 오늘의 날짜
		LocalTime now = LocalTime.now(); // 현재 시간
		
		LocalDate birthDate = LocalDate.of(1999, 12, 31); // 1999년 12월 31일
		LocalTime birthTime = LocalTime.of(23, 59, 59); // 23시 59분 59초
		
		System.out.println("today = " + today);
		System.out.println("now = " + now);
		System.out.println("birthDate = " + birthDate);
		System.out.println("birthTime = " + birthTime);
		
		System.out.println(birthDate.withYear(2000));
		System.out.println(birthDate.plus(1, ChronoUnit.DAYS));
		System.out.println(birthDate.plusDays(1));
		
		System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS)); // 23:59:59 -> 23:00
		
		// 특정 ChronoField의 범위를 알아내는 방법
		System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());
		System.out.println(ChronoField.HOUR_OF_DAY.range());

	}

}
