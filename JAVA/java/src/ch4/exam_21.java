package ch4;

public class exam_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i = 0; i<10; i++) {
//			System.out.println("i값은? "+i);
			System.out.printf("i값은? %d sum값은? %d\n",i,sum+=i);
			System.out.println("sum값은? "+ sum);
		}
		
	}

}
