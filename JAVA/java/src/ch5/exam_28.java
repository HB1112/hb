package ch5;

public class exam_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] student = {100,95,90,88,93};
		int sum=0;
		for(int i = 0; i<student.length;i++) {
			sum=sum+student[i];
		}
		System.out.println("점수평균 : "+sum/(float)student.length);
				
	}

}
