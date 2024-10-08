package ch8;

public class ggobuk extends pokemon {
	ggobuk(){
		this.name = "꼬부기";
	}

	@Override
	void attack() {
		System.out.println("물대포");
		
	}

	@Override
	void sound() {
		System.out.println("꼬북꼬북");
		
	}
	
}
