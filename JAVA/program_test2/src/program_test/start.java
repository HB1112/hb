package program_test;

import java.util.Scanner;

public class start {

	public static void main(String[] args) {
		System.out.println("안녕하세요 HB소프트 입니다.");
		
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		join ji = new join();
		getmember gm = new getmember();
		holiday day = new holiday();
		
		while(true) {
			System.out.println("프로그램을 선택해주십시오.");
			System.out.println("0.종료");
			System.out.println("1.회원가입");
			System.out.println("2.휴가신청");
			System.out.println("3.회원조회");
			
			
			//재료 확보

			//재료 손질
			choice = sc.nextInt();
		
			//0일 경우 종료
			if(choice == 0) {
				System.out.println("종료합니다");
				break;
			}
			//1~3이 아니면 재입력 요청
			if(choice>3 || choice<1) {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요");
				continue;
			}
			
			//결과 도출
			switch (choice){
			case 1:
				ji.member_join(sc);
				break;
			case 2 : 
				day.useholi();
				break;
			case 3 :
				System.out.println("1.전체회원조회");
				System.out.println("2.단일회원조회");
				int members = sc.nextInt();
				if(!(members==1 || members==2)) {
					System.out.println("잘못된 입력입니다. 다시 선택해주세요");
				}
				switch (members) {
				case 1:
					gm.allmember();
					break;
				case 2:
					gm.onemember();
					break;
				}
				break;
			}
		}
		
	}

}
