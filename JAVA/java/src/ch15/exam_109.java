package ch15;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class exam_109 {
	public static void main(String[] args) {
		InetAddress ip = null;
		try {
			ip = InetAddress.getByName("www.daum.net");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("getHostName() : "+ ip.getHostName());
		System.out.println("getHostAddress() : " + ip.getHostAddress());
		
		try {
			ip=InetAddress.getByName("www.naver.com");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("getHostName() : "+ ip.getHostName());
		System.out.println("getHostAddress() : " + ip.getHostAddress());
		
		try {
			ip=InetAddress.getByName("www.e12e12323.com");
			System.out.println("getHostName() : "+ ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
