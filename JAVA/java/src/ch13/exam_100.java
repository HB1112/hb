package ch13;

import java.io.*;

public class exam_100 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis =null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("C:\\prac.txt");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("result.txt");
			bos = new BufferedOutputStream(fos);
			int data;
			while((data = fis.read())!=-1) {
				bos.write(data);
			}
			bos.close();
			bis.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}