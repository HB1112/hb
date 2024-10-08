package ch2;

public class exam_19 {
	public static void main(String[] args) {
		int book = 13;
		book = book/10;
		switch(book) {
			case 0:
				System.out.println("조금 더 노력하세요");
				break;
			case 1:
				System.out.println("책 읽는 것을 즐기는 분이시네요");
//				break; // break 가 없을 시 아래 구문까지 실행됨
			case 2:
				System.out.println("책을 사랑하는 분이시네요");
				break;
			default:
				System.out.println("당신은 다독왕입니다");
		}
	}
}
