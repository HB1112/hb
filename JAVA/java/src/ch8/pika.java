package ch8;

public class pika extends pokemon {
	pika(){
		this.name = "피카츄";
	}

	@Override
	void attack() {
		System.out.println("전기 공격");
	}

	@Override
	void sound() {
		System.out.println("피카피카!");
	}
	
}
