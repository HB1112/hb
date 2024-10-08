package ch8;

public class exam_67 {
	public static void main(String[] args) {
		int age = -19;
		try {
			ticketing(age);
		}catch(ageexception e) {
			e.printStackTrace();
		}
	}
	public static void ticketing(int age) throws ageexception{
		if(age<19) {
			throw new ageexception("나이 입력이 잘못되었습니다");
		}
	}
}
class ageexception extends Exception{
	public ageexception() {}
	public ageexception(String message) {
		super(message);
	}
}