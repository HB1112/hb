package ch7;

public class child extends parents{
	child(int a){
//		super();
	}
	
	@Override
	void printer() {
		System.out.println("프린터함수를 출력함");
	}

	@Override
	void a() {
	}

	@Override
	void b() {
		
	}

	public static void main(String[] args) {
		//System.out.println(a); // 상속과 별개로 인스턴스변수 이므로 사용 불가
		System.out.println(b);
		
		child ch = new child(3);
		ch.test();
	}
	public void test() {
		super.printer();
		this.printer();
	}
}

