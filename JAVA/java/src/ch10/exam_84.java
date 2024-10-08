package ch10;

import java.time.LocalTime;

public class exam_84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime it = LocalTime.now();
		System.out.println(it);
		
		LocalTime new_time = it.withHour(3)
				.withMinute(25)
				.withSecond(24)
				.withNano(3333);
		System.out.println(new_time);
	}

}
