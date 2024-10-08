package ch10;

import java.time.LocalDateTime;

public class exam_82 {
	public static void main(String[] args) {
		LocalDateTime id = LocalDateTime.now();
		System.out.println("현재시간 : "+id);
		LocalDateTime id2 = id
				.minusHours(5)
				.plusMinutes(30)
				.minusSeconds(4);
		
		System.out.println("변경시간 : "+id2);
		LocalDateTime id3 = id2.minusHours(24);
		System.out.println("자동변환시간 : "+id3);
	}
}
