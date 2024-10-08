package ch6;

public class car {
	boolean powerOn = false;
	String color;
	int wheel;
	int speed = 80;
	boolean wiperOn = true;
	
	void power() {
		powerOn = !powerOn;
	}
	void speedUp() {
		speed+=5;
	}
	void speedDown() {
		speed-=5;
	}
	void wiper() {
		wiperOn = !wiperOn;
	}
}
