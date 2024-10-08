package ch2;

public class exam_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 4;
		
		if(age>19) {
			System.out.println("성인입니다");
			System.out.println("성인요금");
		}else if(age > 13) {
			System.out.println("청소년입니다");
			System.out.println("청소년 요금");
		}else if(age >8) {
			System.out.println("어린이 입니다");
			System.out.println("어린이 요금");
		}else {
			System.out.println("유아입니다");
			System.out.println("유아요금");
		}
	}

}
