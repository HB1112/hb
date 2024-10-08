package ch8;

public class exam_54 {

	public static void main(String[] args) {
		pika pika1 = new pika();
		System.out.println("이 포켓몬은 : "+pika1.getName());
		pika1.attack();
		pika1.sound();
		
		ggobuk ggobuk1 = new ggobuk();
		System.out.println("이 포켓몬은 : "+ggobuk1.getName());
		ggobuk1.attack();
		ggobuk1.sound();
	}

}
