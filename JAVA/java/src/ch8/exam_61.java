package ch8;

public class exam_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a = {2,0};
			int b =4;
			int c = b/a[1];
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("산술오류 발생");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열길이 오류발생");
		}
		System.out.println("예외처리");
	}

}
