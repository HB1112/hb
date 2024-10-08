package ch15;

import java.io.*;
import java.net.*;


public class exam_111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String serverIp="127.0.0.1";
		System.out.println("서버에 연결을 시도하는 중...");
		Socket socket;
		try {
			socket = new Socket(serverIp,8000);
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			System.out.println("서버로부터 받은 메시지 :" + dis.readUTF());
			dis.close();
			socket.close();
			System.out.println("연결이 종료되었습니다");
		} catch (ConnectException ce) {
			// TODO Auto-generated catch block
			ce.printStackTrace();
		} catch (IOException ie) {
			// TODO Auto-generated catch block
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
