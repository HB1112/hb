package ch11;

import java.util.ArrayList;
import java.util.LinkedList;

public class exam_91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		long start = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			al.add(0,String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList 작업 시간 : " + (end-start));
		start = System.currentTimeMillis();
		for(int i = 0; i<100000; i++) {
			ll.add(0,String.valueOf(i));
		}
		end=System.currentTimeMillis();
		System.out.println("LinkedList 작업시간 : "+ (end-start));
	}

}
