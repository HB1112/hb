package ch6;

public class exam_39 {
	String model = "Galaxy 24";
	String color ;
	int capacity;
	exam_39(){} //아래 매개변수가 있는 생성자를 만들었을 시 기본생성자는 자동으로 생성되지 않음
	exam_39(String color, int capacity){
		this.color = color;
		this.capacity = capacity;
	}
	public static void main(String[] args) {
		
		//exam_39 myphone1 = new exam_39();  // 기본생성자가 자동으로 만들어지지 않았을 때 에러 발생 // 직접 기본생성자를 작성해야함
		exam_39 myphone = new exam_39("black",256);
		
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);

	}

}
