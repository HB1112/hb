package ch6;

public class exam_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area.manual();
		// 그외 함수 호출 시 에러 발생, static 선언이 없음
		
		area cal = new area();
		
		cal.manual();
		System.out.println(cal.triangle(3, 5));
		System.out.println(cal.rectangle(3, 4));
		System.out.println(cal.circle(3));
	}

}
