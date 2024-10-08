package pack1;
import pack2.*; //package가 다른 클래스 가져오기


public class a {
	public a(){}
	public int a = 10;
	public static void main(String[] args) {
		b case1 = new b();
//		pack2.c case2 = new pack2.c(); //package가 다름
		//pack2.으로 연결 //class c public 선언
		c case2 = new c();
		case2.c=10;
		d case3 = new d();
		//import 선언으로 연결 
	}

}
