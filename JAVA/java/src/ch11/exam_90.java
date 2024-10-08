package ch11;

import java.util.ArrayList;

public class exam_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		System.out.print("초기상태 : ");
		System.out.println(list1);
		
		System.out.println("인덱스 1 위치에 B 추가");
		list1.add(1,"B");
		System.out.println(list1);
		System.out.print("인덱스 2 위치의 값 삭제 : ");
		list1.remove(2);
		System.out.println(list1);
		
		System.out.println("인덱스 2번 위치의 값 반환" + list1.get(2));
	}

}
