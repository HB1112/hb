package ch2;

public class exam_1 {

	public static void main(String[] args) {

		//자동 형변환 : 데이터의 손실이 없어야 한다.
		byte a = 10;
		short b = -129;
		int c = 30;
		long d = 40;
		
		//테스트 1 : 같은 타입끼리 형 변환 / 큰 것을 작은 것으로 넣는 것 X
		byte test_1 = (byte)b; //type miss match (byte)강제 형변환
		System.out.println(test_1); //-128~127 범위 밖의 숫자일 경우 왜곡이 일어나 범위를 순환 ex) 128을 넣을 시 -127로 돌아옴 / -129 > 127
		//테스트 2 : 작은 것을 큰 것으로
		short test_2 = a;
		System.out.println(test_2);
		//테스트 3 : 정수와 실수 사이의 형변환
		int cc = 20;
		float dd = 3.14f;
		int test_3 = (int)dd; //실수 > 정수 캐스팅 시 소숫점 숫자는 버려짐 // 값이 왜곡이 일어나기 때문에 자동변환 x
		System.out.println(test_3);
		//테스트 4 : 정수를 실수로 변환
		float test_4 = cc;
		System.out.println(test_4); // 20.0으로 변환됨 // 값에 왜곡이 없기때문에 자동형변환 가능
		
		//테스트 5 : 정수 > 문자
		int ccc = 10;
		int ddd = 'a';
		//char test_5 = ccc; // 타입 미스매치 > 숫자 > 문자 안된다
		//테스트 6 : 문자 > 정수
		//char 은 원래부터 숫자와 문자의 양면성을 가진다 //아스키코드,유니코드에 할당된 숫자가 있음
		int test_6 = ddd;
		System.out.println(test_6);
		//테스트 
		
		String bbc = "abc";
	}

}
