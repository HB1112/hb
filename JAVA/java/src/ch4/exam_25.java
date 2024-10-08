package ch4;

import java.util.Scanner;

public class exam_25 {

	public static void main(String[] args) {
		int money = 10000;
		System.out.println("현재가진돈은 10000원입니다");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("얼마를 사용하시겠습니까");
			int i = sc.nextInt();
			
			if(!(0<=i&&i<=money)) {
				System.out.println("다시 입력");
				continue;
			}
			System.out.printf("이제 %d원 남았습니다",money-=i);
			
			if(money==0) {
				break;
			}
		}
		System.out.println("돈을 모두 사용하였습니다.");

	}

}
