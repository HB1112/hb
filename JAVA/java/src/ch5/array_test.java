package ch5;

public class array_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 변수 선언
		// 숫자 : 정수 실수 논리
		// 문자 : char
		
		int[] a;
		float[] b;
		boolean[] c;
		char[] d;
		
		// 배열 변수 초기화 // 갯수 만 초기화
		a = new int[3];
		b = new float[3];
		c = new boolean[3];
		d = new char[3];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		b[0]=1.1f;
		b[1]=1.2f;
		b[2]=1.3f;
		c[0]=true;
		c[1]=false;
		c[2]=false;
		
		for(int i =0; i<d.length; i++) {
			d[i]=(char)('a'+i-32);
			System.out.println(d[i]);
		}
		// 배열 생성 및 초기화
		int[] aa = {1,2,3};
		float[] bb = {1.1f,1.2f,1.3f};
		for(int i = 0; i<3; i++) {
			System.out.println(bb[i]);
		}
	}

}
