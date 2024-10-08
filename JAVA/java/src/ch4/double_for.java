package ch4;

public class double_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num = 2;
//		for(int i=1; i < 10; i++) {
//			System.out.println(num+"X"+i+"="+(num*i));
//		}
		
		
		
		System.out.println("구구단 시작");
		for(int i=2;i<10;i++) {
			System.out.println("구구단"+i+"단");
			for(int j = 1; j<10; j++) {
				if(j==9) {
					System.out.println(i+"X"+j+"="+(i*j)+" ");
				}else {
					System.out.printf(i+"X"+j+"="+(i*j)+" ");
				}
			}
		}
		System.out.println("구구단 종료");
	}

}
