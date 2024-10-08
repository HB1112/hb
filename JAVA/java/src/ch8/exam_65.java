package ch8;

public class exam_65 {
	public static void main(String[] args) {
		try {
			methoda();
		}catch(Exception e) {
			System.out.println("메인에서 처리");
		}
	}
	public static void methoda() throws Exception{
		methodb();
	}
	public static void methodb() throws Exception{
		methodc();
	}
	public static void methodc() throws Exception{
		Exception e = new Exception();
		throw e;
	}
}
