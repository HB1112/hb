package ch10;

import java.util.Calendar;

public class exam_71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		Calendar endofyear = Calendar.getInstance();
		Calendar christmas = Calendar.getInstance();
		
		endofyear.set(Calendar.MONTH, 11);
		endofyear.set(Calendar.DATE, 31);
		
		long diff = endofyear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("연말까지 남은 날:" + diff/(24*60*60*1000)+"일");
		
		christmas.set(2024,11,25);
		diff = christmas.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("크리스마스까지 남은 날:" + diff/(24*60*60*1000)+"일");
	}

}
