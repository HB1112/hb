package ch6;

public class exam_38 {
	
	static int sum(int a, int b) {
		return a+b;
	}
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
	static double sum(double a, double b, double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		overloading a = new overloading();
		System.out.println(a.sum(3,2));
		System.out.println(a.sum(2,3,4));
		System.out.println(a.sum(2, 3.55, 4.5));
		
		System.out.println(sum(3,2));
		System.out.println(sum(2,3,4));
		System.out.println(sum(2, 3.55, 4.5));
		// 같은 클래스 내에서 클래스함수 호출 시 클래스명.메서드() 에서 클래스명 생략가능
	}

}
