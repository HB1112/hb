package ch12;

public class exam_98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythb s1 = new mythb();
		Thread t1 = new Thread(s1,"A");
		Thread t2 = new Thread(s1,"B");
		Thread t3 = new Thread(s1,"C");
		t1.start();
		t2.start();
		t3.start();
	}

}
class mythb implements Runnable{
	Ticketing ticket = new Ticketing();
	public void run() {
		ticket.ticketing();
	}
}
class Ticketing{
	int ticketn = 1;
	public synchronized void ticketing() {
		if(ticketn>0) {
			System.out.println(Thread.currentThread().getName()+"가 티케팅 성공");
			ticketn = ticketn-1;
		}else {
			System.out.println(Thread.currentThread().getName()+"가 티케팅 실패");
		}
		System.out.println(Thread.currentThread().getName()+"가 티케팅시도 후 티켓 수:"+ticketn);
	}
}