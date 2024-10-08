package ch12;

public class exam_97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myth8 s1 = new myth8();
		myth9 s2 = new myth9();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		t1.start();
		try {
			t1.join();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		t2.start();
		try {
			t2.join();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		for(int i=0; i<10;i++) {
			System.out.println("메인스레드"+i);
		}
	}

}
class myth8 implements Runnable{
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println("t1: "+i);
		}
		System.out.println("t1 완료");
	}
}
class myth9 implements Runnable{
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println("t2: "+i);
		}
		System.out.println("t2 완료");
	}
}
