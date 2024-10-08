package ch15;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class exam_108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress ip = null;
		try {
			ip = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("getHostName() : " + ip.getHostName());
		System.out.println("getHostAddress : " + ip.getHostAddress());
	}

}
