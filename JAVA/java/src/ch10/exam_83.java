package ch10;

import java.time.LocalDate;

public class exam_83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate id = LocalDate.now();
		System.out.println(id);
		LocalDate new_id = id.withYear(1999)
				.withDayOfYear(23)
				.withMonth(8);
//				.withDayOfMonth(23);
		System.out.println(new_id);
	}

}
