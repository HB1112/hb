package ch10;

import java.util.Calendar;

public class exam_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar a = Calendar.getInstance();
		
		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH);
		int date = a.get(Calendar.DATE);
		
		System.out.println(year + "년"+month+"월"+date+"일");
		System.out.println(a.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("이번년도에서 오늘이 몇일째인가");
		System.out.println(a.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("이번달은 며칠까지 있는가");
		System.out.println(a.getActualMaximum(Calendar.DATE));
	}

}
