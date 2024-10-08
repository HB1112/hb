package ch10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class exam_80 {

	public static void main(String[] args) {
		Date day = new Date();
		String patternkorea = "yyyy-MM-dd";
		String patternusa = "MM-dd-yyyy";
		String patternuk = "dd-MM-yyyy";
		String pattern1 = "E요일 HH시 mm분 ss초";
		
		SimpleDateFormat p1 = new SimpleDateFormat(patternkorea);
		SimpleDateFormat p2 = new SimpleDateFormat(patternusa);
		SimpleDateFormat p3 = new SimpleDateFormat(patternuk);	
		SimpleDateFormat p4 = new SimpleDateFormat(pattern1);
		
		System.out.println("현재날짜 : "+day);
		System.out.println("한국형식(년,월,일) : " + p1.format(day));
		System.out.println("미국형식(월,일,년) : "+p2.format(day));
		System.out.println("영국형식(일,월,년) : "+p3.format(day));
		System.out.println(p4.format(day));
	}

}
