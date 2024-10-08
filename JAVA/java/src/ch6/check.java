package ch6;

public class check {
	static int cv = 5;
	int iv = 4;
	static void cm() {
	}
	void im() {
		
	}
	static void cm_imember() { // 자신은 존재하지만 존재하지 않는 곳을 접근하기 때문에 불가능
		//클래스 메서드가 인스턴스멤버에 접근
//		System.out.println(iv);
//		im(); 에러
	}
	void im_cmember() { // 현재는 없지만 new 이후 존재 > 이미 존재하는 곳을 접근하기 때문에 가능
		//인스턴스 메서드가 클래스 멤버에 접근
		System.out.println(cv);
		cm();
	}
	static void cm_cmember() { // 둘 다 존재
		System.out.println(cv);
		cm();
	}
	void im_imember() { // 둘 다 현재 존재 x > new 이후 둘다 생성되기 때문에 가능
		System.out.println(iv);
		im();
	}
}
