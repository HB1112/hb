package test;

import java.util.Scanner;

//함수를 작성할 수 있는가?
//함수를 생성할 수 있는가?
//함수를 호출할 수 있는가?
//함수에 파라미터를 전달할 수 있는가?
//함수의 리턴을 적절하게 조절할 수 있는가?
public class tb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("------------------");
			System.out.println("실행할 연산을 선택하시오");
			System.out.println("1.곱하기");
			System.out.println("2.나누기");
			System.out.println("3.더하기");
			System.out.println("4.빼기");
			System.out.println("5.종료");
			System.out.println("------------------");
			int how = sc.nextInt();
			if(how == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
			if(!(how>=1 && how<=4)) {
				System.out.println("다시 입력해주세요");
			}else {
				System.out.println("첫번째 숫자를 입력해주세요");
				int first = sc.nextInt();
				System.out.println("두번째 숫자를 입력해주세요");
				int second = sc.nextInt();
				switch (how) {
				case 1:
					System.out.println("곱하기 : "+mul(first,second));
					break;
				case 2:
					System.out.println("나누기 : "+div(first,second));
					break;
				case 3:
					System.out.println("더하기 : "+plus(first,second));
					break;
				case 4:
					System.out.println("빼기 : "+minus(first,second));
				}
			}
		}
		
	}
	static int mul(int a, int b) {
//		System.out.println("mul함수");
		return a*b;
	}
	static int div(int a, int b) {
//		System.out.println("div함수");
		return a/b;
	}
	static int plus(int a, int b) {
//		System.out.println("plus함수");
		return a+b;
	}
	static int minus(int a, int b) {
//		System.out.println("minus함수");
		return a-b;
	}
}
