package ch15;

import java.io.*;
import java.net.*;

public class exam_110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(8000);
			System.out.println("서버가 준비되었습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true) {
			System.out.println("연결을 기다리는중");
			Socket socket;
			try {
				socket = serverSocket.accept();
				System.out.println(socket.getInetAddress()+"연결 요청이 들어왔습니다");;
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF("서버와 연결되었습니다");
				System.out.println("메시지를 전송합니다");
				dos.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
