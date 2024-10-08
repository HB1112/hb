package ch2;
// 파일의 이름인 exam1과 아래의 class 이름(exam1)은 같아야한다 
public class exam1 
{
	//클래스의 자식은 변수 + 함수
		public static void main(String[] args) 
	{	
		// what : 데이터를 담는 상자 변수
		// why 변수를 사용하는 이유는 ? 재사용하기 위해서
		// how 생성 방법 : 데이터타입 변수명;
		// how 초기화(값을 넣는) 방법 : 변수명 = 데이터;
		// 정수형 변수
		byte a = 10;
		short b = 20;
		int c =30;
		long d = 40; // long d = 40L;
		System.out.println(10); //println() 함수에 10을 전달
		System.out.println(a); // println() 함수에 a 변수의 값 10을 전달
		// 실수형 변수
		float e = 3.14f;
		double f = 3;
		System.out.println(e);
		System.out.println(f);
		// 문자형 변수
		char g = '가';
		System.out.println(g);
		// 논리형 변수
		boolean h = true;
		boolean i =false;
		System.out.println(h);
		System.out.println(i);
		//생선된 변수의 값을 변경하기
		a = 20;
		// 보라색 : 명령어
		// 갈색/파란색 : 변수
		// "a",'a' : 문자
		// 10 : 숫자
		// a() : 함수
		
	}
}
