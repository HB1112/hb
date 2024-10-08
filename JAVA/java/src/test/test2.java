package test;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month =6;
		if(month == 12 || month == 1 || month == 2) {
			System.out.println("겨울");
		}else if(month >=3 && month <=5) {
			System.out.println("봄");
		}else {
			System.out.println("여름,가을");
		}
	}

}
