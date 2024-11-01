package ch10;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class exam_87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt1 = LocalDateTime.of(2024, 1,1,0,2);
		System.out.println(ldt1);
		LocalDateTime ldt2 = LocalDateTime.of(2024, 1,2,0,1);
		System.out.println(ldt2);
		
		System.out.println(ldt1.isAfter(ldt2));
		System.out.println(ldt1.isBefore(ldt2));
		System.out.println(ldt1.isEqual(ldt2));
		
		Duration duration = Duration.between(ldt1, ldt2);
		System.out.println("두 날짜 사이의 차이(초):" + duration);
		
		long hours = ldt1.until(ldt2, ChronoUnit.HOURS);
		System.out.println("두 날짜 사이의 차이(시간)"+ hours);
	}

}
