package ch6;

public class calculator {
	// 1. 리턴 타입지정 2. 매개변수 지정(타입과 갯수) 3. 리턴
	int plus(int a, int b){
		int result = a+b;
		return result;
	}
	int minus(int a,int b, int c){
		int result = a-(b+c);
		return result;
	}
	int multiple(int a, float b){
		int result = a*(int)b;
		return result;
	}
	//몫 리턴
	float div1(int a, int b){
		return a/(float)b;
	}
	//나머지 리턴
	int div2(int a, int b){
		return a%b;
	}


}
