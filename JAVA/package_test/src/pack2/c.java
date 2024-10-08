package pack2;

import pack1.a;

public class c {
	public c(){}
	public int c = 30;
	void test() {
		a tmp = new a();
		tmp.a=10; // not visible 접근 제어자 에러
//		tmp.b=10; // not a field 변수가 없음
	}
}
