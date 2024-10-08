package ch6;

public class exam_34 {
	public static void main(String[] args) {
		System.out.println(cars.wheel);
		//System.out.println(cars.speed);
		
		cars mycar1 = new cars();
		
		System.out.println(cars.wheel);
		System.out.println(mycar1.speed);
		
		cars mycar2 = new cars();
		
		System.out.println("변경전");
		System.out.println("mycar1.speed : "+mycar1.speed);
		System.out.println("mycar2.speed : "+mycar2.speed);
		System.out.println("mycar1.wheel : "+mycar1.wheel);
		System.out.println("mycar2.wheel : "+mycar2.wheel);
		
		mycar2.speed = 100;
		mycar2.wheel = 5;
		System.out.println("변경후");
		System.out.println("mycar1.speed : "+mycar1.speed);
		System.out.println("mycar2.speed : "+mycar2.speed);
		System.out.println("mycar1.wheel : "+mycar1.wheel);
		System.out.println("mycar2.wheel : "+mycar2.wheel);
	}
}
