package ch19.server.echoserver02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoThreadServer {
	public static void main(String[] args) {
		final int PORT = 9000;
		ServerSocket server;
		try {
			server = new ServerSocket();
			System.out.println("Client 접속을 기다립니다....");
			while(true) {
				Socket socket = server.accept();
				EchoThread echoThread = new EchoThread(socket);
				echoThread.start();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

class EchoThread extends Thread{
	private Socket socket;
	
	public EchoThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			InetAddress inetAddr = socket.getInetAddress();
			System.out.println(inetAddr.getHostAddress()+"로부터 접속했습니다.");
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String line;
			while (true) {
				line = br.readLine();
				if (line == null) { // 통신이 끊어짐. 상대방이 종료.
					break;
				}
				System.out.println("클라이언트로부터 수신 : " + line);
				pw.println(line); // 데이터 + '\n'
				pw.flush(); // 버퍼에 남아있는 데이터 즉시 전송
			}
			
			System.out.println(inetAddr.getHostAddress() + "Client 종료");
			pw.close();
			br.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}