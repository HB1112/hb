package ch8;

public  abstract class pokemon {
	String name;
	
	abstract void attack();
	abstract void sound();
	public String getName() {
		return this.name;
	}
}
