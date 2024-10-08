package ch12;

public class exam_93 {

	public static void main(String[] args) {
		mth th1 = new mth();
		Runnable th2 = new mth2();
		Thread t = new Thread(th2);
		
		th1.start();
		t.start();
		for(int i =0; i< 10; i++) {
			System.out.println("메인함수 진행중" + i);
		}
	}

}
class mth extends Thread{
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println("스레드 진행중"+i);
		}
	}
}
class mth2 implements Runnable{
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("러너블 진행중"+ i);
		}
	}
}