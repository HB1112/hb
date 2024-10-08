package ch8;

public class exam_64 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의예외");
			throw e;
			
		}catch(Exception e) {
			System.out.println("예외발생");
			System.out.println(e.getMessage());
		}
	}
}
