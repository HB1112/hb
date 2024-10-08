package test;

public class sample_exam {

	public static void main(String[] args) {
		// char 사용하기
		String test = "abcd2 3efg"; //Object(생략되있음) + String
		for(int i = 0; i < test.length();i++) {
			int ch = test.charAt(i);
			if( (ch >= 65 && ch <= 90) || (ch >= 97 && ch <=122)) {
				System.out.println(test.charAt(i)+"영문자입니다");
			}else {
				System.out.println(test.charAt(i)+"영문자가 아닙니다");
			}
		}
		
		
//		char test2 = 'A';
//		for(int i = 1; i <= 10; i++) {
//			int tmp = i;
//			tmp = tmp + test2 + 32;
//			char result = (char)tmp;
//			System.out.println(result);
//		}

	}

}
