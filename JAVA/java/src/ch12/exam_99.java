package ch12;

public class exam_99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Son son = new Son(account);
		Mom mom = new Mom(account);
		son.start();
		mom.start();
		
	}

}
class Account{
	int money = 0;
	public int showmoney() {
		return money;
	}
	public synchronized void setMoney() {
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		this.money+=2000;
		System.out.println("어머니가 용돈을 입금했습니다. 현재 잔액 : "+this.showmoney());
		
		this.notify();
	}
	public synchronized void getMoney() {
		while(money<=0) {
			try {
				System.out.println("통장잔고가 없어서 아들 대기중");
				this.wait();
			}catch(Exception e) {
				
			}
		}
		this.money-=2000;
		System.out.println("아들이 용돈을 출금했습니다. 현재 잔액 : "+this.showmoney());
	}
}
class Son extends Thread{
	private Account account;
	Son(Account account){
		this.account = account;
	}
	public void run()
	{
		for(int i = 0; i<10;i++) {
			account.getMoney();
		}
	}
}
class Mom extends Thread{
	private Account account;
	Mom(Account account){
		this.account = account;
	}
	public void run()
	{
		for(int i = 0; i<10;i++) {
			account.setMoney();
		}
	}
}
