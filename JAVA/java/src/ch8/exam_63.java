package ch8;

public class exam_63 {
	public static void main(String[] args) {
		int a =0;
		int b = 2;
		try {
			System.out.println("외부로 접속");
			int c = b/a;
			
		}catch(Exception e) {
			System.out.println("오류 발생");
		}finally {
			System.out.println("무조건 연결 해제");
		}
	}
}
