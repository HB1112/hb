package ch8;

public class exam_58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerclass oc = new outerclass();
		System.out.println("outerclass의 a값 : " + oc.a);
		System.out.println("outerclass의 b값 : " + outerclass.b);
		
		System.out.println("\n===inner class 접근하기===");
		outerclass oc2 = new outerclass();
		outerclass.inner i = oc2.new inner();
		System.out.println("inner의 c값 : "+i.c);
		i.innermethod();
		
		outerclass.staticinner si = new outerclass.staticinner();
		System.out.println("staticinner의 d값 : "+ si.d);
		si.staticmethod();
		outerclass.staticinner.staticmethod();
	}

}
class outerclass{
	int a = 3;
	static int b =4;
	class inner{
		int c = 5;
		public void innermethod() {
			System.out.println("inner class");
		}
	}
	static class staticinner{
		int d = 6;
		static int stat = 10;
		public static void staticmethod() {
			System.out.println("static inner");
		}
	}
}
