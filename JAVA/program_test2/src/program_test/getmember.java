package program_test;

import java.util.Scanner;


public class getmember {
	
	//전체 회원 조회
	public void allmember() {
		System.out.println("전체회원조회 도착");
		int length = save.arr.size(); //arr 배열변수 static 선언되있음
		for(int i = 0; i<length; i++) {
			member mb = (member)save.arr.get(i);
			System.out.println("--------------");
			System.out.println("이름 : "+mb.getName());
			System.out.println("나이 : "+mb.getAge());
			System.out.println("휴가 : "+mb.getHoliday());
			System.out.println("전화번호 : "+mb.getTel());
		}
	}
	//단일 회원 조회
	public void onemember() {
		System.out.println("단일회원조회 도착");
		System.out.println("조회할 회원의 이름");
		int length = save.arr.size(); //arr 배열변수 static 선언되있음
		Scanner input_name = new Scanner(System.in); // 조회할 이름 받기
		String search_name = input_name.nextLine(); // 이름 콘솔에서 받기
		boolean find = false;
		for(int i = 0; i<length; i++) {
			member mb = (member)save.arr.get(i);
			String name = (String)mb.getName();
			if(name.equals(search_name)) {
				System.out.println("--------------");
				System.out.println("이름 : "+mb.getName());
				System.out.println("나이 : "+mb.getAge());
				System.out.println("휴가 : "+mb.getHoliday());
				System.out.println("전화번호 : "+mb.getTel());
				find = true;
				break;
			}
		}
		if(find==false) {
			System.out.println("찾지 못하였습니다");
		}
	}
}
