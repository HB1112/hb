package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exam_76 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			//D:\HB\JAVA\java\src\ch10\test
			fis = new FileInputStream("src\\test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(fis);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

	}

}
