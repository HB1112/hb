package ch7;

public class c1 {
	c1(){}
	public static void main(String[] args) {
		d 소개남 = new d();
		
		b1 단발머리연락처 = new b1();
		b2 긴생머리연락처 = new b2();
		
		a1 연락처 = new b1();
		소개남.연락처수신(연락처); 
		//다른 연락처를 d 에 줄 시 d클래스 내 함수의 매개변수 데이터타입 바뀌어야함
		//다형성 이용 시 다른 클래스의 코드를 바꿀 필요가 없다 
		//d클래스 함수 매개변수에 보내려는 파라미터의 부모 타입으로 설정 시
		//부모의 자식들 끼리 스왑이 가능함 // 즉 다른 클래스의 코드를 수정할 필요가 없음!
		
		
//		b1 first = new b1();
//		//b2로 변경하려면 변수와 생성자 수정
//		//b2 first = new b2();
//		first.test_p();
//		System.out.println(first.a);
//		
//		//a1 second = new b1(); //부모로 연결됨...? second는 b1의 주소를 담는가? a1의 주소를 담는가?
//		// 다형성 사용시 생성자만 수정
//		a1 second = new b2();
//		
//		second.test_p(); // 오버라이딩 된 함수
//		System.out.println(second.a); // 부모의 변수
	}

}
