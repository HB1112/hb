package ch8;

import java.util.Scanner;

public class exam_55 {
	public static void main(String[] args) {
		
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("투어선택");
		System.out.println("1.한국투어 2.일본투어");
		choice = sc.nextInt();
		
		TourGuide guide = new TourGuide(choice);
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
		guide.rest();
	}
}
interface Providable{
	void leisureSports();
	void sightseeing();
	void food();
//	void rest();
}
class KoreaTour implements Providable{

	@Override
	public void leisureSports() {
		System.out.println("한강에서 수상스키 투어");
		
	}

	@Override
	public void sightseeing() {
		// TODO Auto-generated method stub
		System.out.println("경복궁 관람 투어");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("전주 비빔밥 투어");
	}
	public void rest() {
		System.out.println("호텔에서 휴식");
	}
	
}
class japantour implements Providable{

	@Override
	public void leisureSports() {
		System.out.println("도쿄타워 번지점프");
		
	}

	@Override
	public void sightseeing() {
		// TODO Auto-generated method stub
		System.out.println("오사카 관람");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("초밥 투어");
	}
	
}
class TourGuide{
	int choice;
	private Providable tour;
	TourGuide(){}
	TourGuide(int a){
		choice = a;
		if(choice == 1) {
			 tour = new KoreaTour();
		}else {
			tour = new japantour();
		}
	}
	
	public void leisureSports() {
		tour.leisureSports();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
	public void rest() {
//		tour.rest(); // koreatour로 생성하였지만 providable타입으로 지정하여 부모에는 없는 rest()함수는 사용할 수 없음
	}
}