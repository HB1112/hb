package program_test;

import java.util.Scanner;

public class holiday {
	
	public void useholi() {
		Scanner sc = new Scanner(System.in);
		String who;
		System.out.println("회원 이름");
		who = sc.nextLine();
		System.out.println("사용할 휴가 일수");
		int day = sc.nextInt();
		int holiday;
		int length = save.arr.size();
		for(int i = 0; i < length; i++) {
			member mb = (member)save.arr.get(i);
			String name = (String)mb.getName();
			if(who.equals(name)) {
				holiday = (int)mb.getHoliday()-day;
				mb.setHoliday(holiday);
				System.out.println("남은 휴가일수 : "+mb.getHoliday());
			}
		}
	}
	
}
