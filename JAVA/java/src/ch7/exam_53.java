package ch7;

public class exam_53 {
	public static void main(String[] args) {
		Animals lion1 = new Lion();
		Animals rabbit1 = new Rabbit();
		Animals monkey1 = new Monkey();
		
		Zookeeper james = new Zookeeper();
		james.feed(monkey1);
		james.feed(rabbit1);
		james.feed(lion1);
	}
}

class Animals{
	Animals(){}
	void breath() {
		System.out.println("숨쉬기");
	}
}
class Lion extends Animals{
	Lion(){super();}
	public String toString() {
		return "사자";
	}
}
class Rabbit extends Animals{
	Rabbit(){super();}
	public String toString() {
		return "토끼";
	}
}
class Monkey extends Animals{
	Monkey(){super();}
	public String toString() {
		return "원숭이";
	}
}
class Zookeeper{
	Zookeeper(){}
	void feed(Animals animal) {
		System.out.println(animal+" 먹이주기");
	}
}