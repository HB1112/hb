package ch6;

public class method_test {

	public static void main(String[] args) {
		// 객체 생성
		calculator cl = new calculator();
		
		int pr = cl.plus(3, 4);
		System.out.println(pr);
		int mr = cl.minus(1, 2, 3);
		System.out.println(mr);
	}

}
