package ch8;

public class exam_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mycellphone phone1 = new mycellphone();
		camera phone2 = new mycellphone();
		call phone3 = new mycellphone();
		memo phone4 = new mycellphone();
		Clock phone5  = new mycellphone();
		phoneuser user1 = new phoneuser();
		user1.call(phone3);
		user1.call(phone1);
	}

}
interface camera{
	void photo();
}
interface call{
	void calling();
}
interface memo{
	void write();
}
interface Clock{
	void clock();
}
class mycellphone implements camera,call,memo,Clock{

	@Override
	public void clock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		
	}
	
}
class phoneuser{
	void call(call c) {
		System.out.println("전화를  걸었습니다.");
	}
}