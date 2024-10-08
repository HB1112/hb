package ch10;

import java.time.LocalDate;

public class exam_81 {
	public static void main(String[] args) {
		LocalDate id = LocalDate.now();
		System.out.println(id);
		LocalDate id2 = id
				.minusYears(2)
				.plusMonths(3)
				.minusDays(4);
		System.out.println(id2);
		
		LocalDate id3 = id2.minusDays(3);
		System.out.println(id3);
		
		LocalDate id4 = id3.plusWeeks(3);
		System.out.println(id4);
				
	}
}
