package ch4;

public class while_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<10){
			System.out.println("시작");
			i++;
			if(i%2==0) {
				System.out.println("짝수 여기까지");
				continue;
			}
			System.out.println(i+"번 돌았다");
		}
	}

}
