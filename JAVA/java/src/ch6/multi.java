package ch6;

public class multi {
	int multi = 0;
	int m(int a, int b) { // 두수의 곱
		return a*b;
	}
	void m2(int a, int b) { // 구구단
		int multi = 0;
		System.out.println(a+"단 "+ b+"까지");
		for(int i=1;i<=b;i++) {
			multi = a*i;
			System.out.println(a+"X"+i+"="+multi);
		}
	}
	public static void main(String[] args) {
		multi a = new multi();
		System.out.println(a.m(2, 3));  // 파라미터 두 수의 곱
		a.m2(4,8); // 파라미터 받은 값의 구구단
	}

}
