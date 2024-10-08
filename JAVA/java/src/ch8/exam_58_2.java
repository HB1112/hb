package ch8;

public class exam_58_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerclass1 o = new outerclass1(){
			void a() {
				System.out.println("새롭게 정의한 익명 클래스의 메서드 입니다");
			}
		};
		o.a();
		outerclass1 ok = new outerclass1();
		ok.a();
	}

}
class outerclass1{
	void a() {
		System.out.println("method a");
	}
	void b() {
		
	}
}
