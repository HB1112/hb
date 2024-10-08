package ch7;

public class exam_50 {

	public static void main(String[] args) {
		A obj = new B();
		obj.methodA();
		//obj.methodB(); // 오류 오버라이딩 되지 않아서 //부모타입으로 선언했기 때문에 부모에 있는 변수나 메서드만 사용 가능

	}

}
class A{
	A(){}
	void methodA() {
		System.out.println("메서드A");
	}
}
class B extends A{
	B(){super();}
	void methodB() {
		System.out.println("메서드B");
	}
}