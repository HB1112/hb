package test;

//import ch7.Car2;
//import ch7.SportsCar;

class Car2{
	int wheel;
	int speed;
	String color;
	Car2(){}
	Car2(String color){
		this.color = color;
	}
}
class SportsCar extends Car2{
	int speedLimit;
	SportsCar(String color, int speedLimit){
//		super(color);
		super();
		this.color = color;
		this.speedLimit = speedLimit;
	}
	
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsCar sportsCar1 = new SportsCar("red",330);
		System.out.println(sportsCar1.color);
		System.out.println(sportsCar1.speedLimit);
	}

}
