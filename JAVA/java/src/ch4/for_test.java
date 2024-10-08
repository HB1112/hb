package ch4;

public class for_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i = 0; i<10; i++) {
//			System.out.println("i값은? "+i);
			sum +=i;
			System.out.printf("i값은? %d \n",i);
			System.out.println("sum값은? "+ sum);
		}
		int j =0;
		int sum2 = 0;
		while(j<10) {
			System.out.println("j값은? "+j);
			sum2 = sum2+j;
			System.out.println("sum값은 ?"+sum2);
			j++;
		}
		
	}

}
