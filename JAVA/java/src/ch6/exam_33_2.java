package ch6;
class a{
	static int aa;
}
class b{
	int bb;
}
public class exam_33_2 {

	public static void main(String[] args) {
		// TODO Auto-gener
		// 인스턴스 변수 
		// 참조변수.변수명
		b v1 = new b();
		b v2 = new b();
		v1.bb = 10;
		v2.bb = 20;
		// 클래스 변수
		// 클래스이름. 변수명
		a.aa = 10;
	}

}
