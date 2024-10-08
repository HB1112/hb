package ch8;

public class exam_57 {
	static class staticinner{}
	class instanceinner{}
	
	staticinner st1 = new staticinner();
	instanceinner ii1 = new instanceinner();
	
	static void staticmethod() {
		staticinner st2 = new staticinner();
//		instance ii2 = new instanceinner();

	}
	void instancemethod() {
		staticinner st3 = new staticinner();
		instanceinner ii3 = new instanceinner();
	}
}
