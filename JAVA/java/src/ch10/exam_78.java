package ch10;

import java.util.Timer;
import java.util.TimerTask;

public class exam_78 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		throws InterruptedException {
			Timer t = new Timer(true);
			TimerTask w1 = new work1();
			TimerTask w2 = new work2();
			t.schedule(w1, 3000);
			t.schedule(w2, 1000);
			Thread.sleep(4000);
			System.out.println("모든 작업 종료");
		
	}

}
class work1 extends TimerTask{
	public void run() {
		System.out.println("work1 실행");
	}
}
class work2 extends TimerTask{
	public void run() {
		System.out.println("work2 실행");
	}
}