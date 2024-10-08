package ch4;

import java.util.Scanner;

public class exam_17 {
	//입력받은 나이를 통해서 알맞은 출력을 선택
	public static void main(String[] args) {
		//재료 수집 : 변수 생성
		//변수 초기화 방법 :
		//1. 수동으로  정적 변수 생성 : int a = 3;
		//2. 함수를 통해서 동적 변수 생성 : 라이브러리 활용
		int age;
		//콘솔을 통하여 값을 입력받기 위한 객체
		Scanner sc = new Scanner(System.in);
		//재료 손질 : 변수를 연산
		System.out.println("나이를 입력해주세요!"); //콘솔 입력 가이드
		//age = sc.nextInt();
		String tmp = sc.nextLine();
		age = Integer.parseInt(tmp);
		System.out.println("입력받은 나이 : "+age);
		//결과 도출 
		if(age>19) {
			System.out.println("성인입니다");
			System.out.println("성인요금입니다");
		}else if(age>13) {
			System.out.println("청소년입니다");
			System.out.println("청소년요금입니다");
		}else if(age>8) {
			System.out.println("어린이입니다");
			System.out.println("어린이요금입니다");
		}else {
			System.out.println("유아입니다");
			System.out.println("유아요금입니다");
		}
		
	}

}
