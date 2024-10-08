package program_test;

import java.util.Scanner;

public class getmember {
	//전체 회원 조회
	public void allmember() {
		System.out.println("전체회원조회 도착");
		int length = save.arr.size();
		for(int i = 0; i<length; i++) {
			member mb = (member)save.arr.get(i);
			System.out.println("--------------");
			System.out.println(mb.getName());
			System.out.println(mb.getAge());
			System.out.println(mb.getHoliday());
			System.out.println(mb.getTel());
		}
	}
	//단일 회원 조회
	public void onemember() {
		System.out.println("단일회원조회 도착");
		Scanner input_name = new Scanner(System.in); // 조회할 이름 받기
		String search_name = input_name.nextLine(); // 이름 콘솔에서 받기
		
		System.out.println("조회할 회원의 이름");
		int length = save.arr.size();
		for(int i = 0; i<length; i++) {
			member mb = (member)save.arr.get(i);
			String name = mb.getName();
			if(name == search_name) {
				System.out.println("--------------");
				System.out.println(mb.getName());
				System.out.println(mb.getAge());
				System.out.println(mb.getHoliday());
				System.out.println(mb.getTel());
			}else {
				System.out.println("찾는 회원이 없습니다");
			}
		}
	}
}
