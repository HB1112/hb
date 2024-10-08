package object_test;

public class start {
	int a;
	static int b;
	
	public static void main(String[] args) {
		System.out.println("start");
		// 램메모리 상의 설계도 member()를 참고하여 객체(클레스)를 생성
		// 생성된 객체는 주소를 할당 받는다
		System.out.println(new member());
		System.out.println(new member());
		member.value=10;
//		new member().age = 4;
		member mb = new member();
		member mb2 = new member();
		System.out.println(mb);
	}

}
