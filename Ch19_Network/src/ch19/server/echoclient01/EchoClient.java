package ch19.server.echoclient01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/* 클라이언트는 서버와 연결되어야 한다.
 * 1) IP, Port을 소켓객체 설정하고 연결을 한다.
 * 2) 연결 후에 서버<->클라이언트 자유롭게 통신한다.
 * 3) 다 마치면 스트림을 종료한다.
 * */
public class EchoClient {
	public static void main(String[] args) {
		final int PORT = 9000;
		try {
			Socket socket = new Socket("192.168.0.58", PORT);
			// 키보드로부터 입력받기 위한 스트림 연결(Scanner대신)
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String line;
			while(true) {
				System.out.println("입력 >> ");
				line = keyboard.readLine();
				if(line.equals("quit")) {
					break;
				}
				pw.println(line);
				pw.flush();
				
				// 서버는 받은 후에 클라이언트로 echo
				line = br.readLine();
				System.out.println("서버로부터 echo 문자열 : " + line);
			}
			
			System.out.println("클라이언트 quit");
			keyboard.close();
			pw.close();
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
