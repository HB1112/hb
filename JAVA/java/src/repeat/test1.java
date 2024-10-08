package repeat;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0; i<10; i++) {
//			System.out.println(i+1);
//		}
//		
//		for(int i = 0; i<=20; i+=2) {
//			System.out.println(i);
//		}
//		
//		int sum = 0;
//		for(int i = 1; i<=100; i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
//		int dan = 2;
//		for(int i = 1; i<10;i++) {
//			System.out.println(dan+"x"+i+"="+(dan*i));
//		}
//		
//		for(int i = 9; i>0; i--) {
//			System.out.println(i);
//		}
//		
//		for(int i = 1; i<=10; i++) {
//			System.out.println(i*i);
//		}
//		
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for(int i = 1; i<=50; i++) {
			if(i%5 ==0) {
				System.out.println(i);
			}
		}
		
	}

}
