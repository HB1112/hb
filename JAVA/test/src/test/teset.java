package test;

public class teset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "안녕하세요, 세계!";
		 int index = str.indexOf("세"); // "세"의 인덱스 찾기
		System.out.println(index); // 출력: 8
		String st2r = "안녕하세요!";
		 int inde2x = st2r.indexOf('하'); // '하'의 인덱스 찾기
		System.out.println(inde2x); // 출력: 3
		String st3r = "안녕하세요, 세계! 안녕하세요!";
		 int inde3x = st3r.indexOf("안", 5); // 인덱스 5부터 "안"을 찾기
		System.out.println(inde3x); // 출력: 17
	}

}