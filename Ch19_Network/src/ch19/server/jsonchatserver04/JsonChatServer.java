package ch19.server.jsonchatserver04;

import java.net.*;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.json.JSONObject;

import java.io.*;

/* 1) EchoServer
 * 	- 서버소켓의 동작방식 (서버소켓(accpt), 통신소켓(send/recv))
 * 2) EchoMultiThreadServer
 * 	- 병렬 처리를 위해 Client 1개당 Thread 1개 배정
 * 3) JsonChatServer
 * 	- 다양한 업무 처리를 위해서 Json 포맷 사용 (패킷)
 * 	- 채팅은 1사람한테 수신된 데이터를 다른 사람한테 전달해야 한다.
 * 	  그러므로 사용자 등록/관리가 필요하다. (HashTable == HashMap+동기화)
 * */
public class JsonChatServer {
	public static void main(String[] args) {
		final int PORT = 9000;
		Hashtable clientHt = new Hashtable();	// 접속자를 관리하는 테이블
		
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			String mainThreadName = Thread.currentThread().getName();
			
			/* main thread는 계속 accept()처리를 담당한다. */
			while(true) {
				System.out.printf("[서버-%s] Client접속을 기다립니다.\n", mainThreadName);
				Socket socket = serverSocket.accept();
				
				
				/* worker thread는 Client와의 통신을 담당한다. */
				WorkerThread wt = new WorkerThread(socket, clientHt);
				wt.start();
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

/* [App 프로토콜 정의]
 * 1) 데이터는 '문자열' 데이터로 한다.
 * 2) '문자열'데이터는 json을 변환한 것으로 한다.
 * 3) json 명령 패킷 종류 *{}내의 데이터는 값을 의미한다.
 * 	3-1) id 등록
 * 		[요청]
 * 		cmd: ID
 * 		id: {id}
 * 		[응답]
 * 		cmd: ID
 * 		ack: ok, fail
 * 	3-2) 사칙연산
 * 		[요청]
 * 		cmd: ARITH
 * 		id: {id}
 * 		op: {연산자}
 * 		val1: {첫번째 값}
 * 		val2: {두번째 값}
 * 		[응답]
 * 		cmd: ARITH
 * 		ack: {결과값}
 * 	3-3) 전체채팅
 * 		[요청]
 * 		cmd: ALLCHAT
 * 		id: {id}
 * 		msg: {메세지}
 * 		[응답]
 * 		cmd: ALLCHAT
 * 		ack: ok, fail
 * 		[전송]
 * 		cmd: BROADCHAT
 * 		id:{id}
 * 		msg:{메시지}
 * 	3-4) 1:1 채팅
 * 		[요청]
 * 		cmd: ONECHAT
 * 		id: {id}
 * 		youId: {상대 id}
 * 		msg: {메세지}
 * 		[응답]
 * 		cmd: ONECHAT
 * 		ack: ok, fail
 *   	[전송]
 * 		cmd: UNICHAT
 * 		id:{id}
 * 		msg:{메시지}
 * */

class WorkerThread extends Thread{
	private Socket socket;
	private Hashtable ht;
	public WorkerThread(Socket socket, Hashtable ht) {
		this.socket = socket;
		this.ht = ht;
	}
	
	@Override
	public void run() {
		try {
			InetAddress inetAddr = socket.getInetAddress();
			System.out.printf("<서버-%s>%s로부터 접속했습니다.\n", getName(), inetAddr.getHostAddress());
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			while(true) {
				/*client가 json오브젝트를 string으로 변환해서 보낸 것을 수신*/
				String line = br.readLine();
				if(line == null) {
					break;
				}
				/* json패킷을 해석해서 알맞은 처리를 한다.
				 * 문자열 -> JSONObject 변환 -> cmd를 해석해서 어떤 명령인지?
				 * */
				JSONObject packetObj = new JSONObject(line);
				processPacket(packetObj);
			}
		}catch(Exception e) {
			System.out.printf("<서버-%s>%s\n", getName(), e.getMessage());
		}
		
	}
	
	private void processPacket(JSONObject packetObj) throws IOException {
		String cmd = packetObj.getString("cmd");
		JSONObject ackObj = new JSONObject();
		if(cmd.equals("ID")) {
			String id = packetObj.getString("id");
			ht.put(id, this.socket);
			
			// 응답
			ackObj.put("cmd", "ID");
			ackObj.put("ack", "ok");
			String ack = ackObj.toString();
			// 클라이언트한테 전송
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			pw.println(ack);
			pw.flush();
		}else if(cmd.equals("ARITH")) {
			String id = packetObj.getString("id");
			String op = packetObj.getString("op");
			String val1 = packetObj.getString("val1");
			String val2 = packetObj.getString("val2");
			double result = arith(op, Double.parseDouble(val1), Double.parseDouble(val2));
			
			ackObj.put("cmd", "ARITH");
			ackObj.put("ack", Double.toString(result));
			String ack = ackObj.toString();
			
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			pw.println(ack);
			pw.flush();
		}else if(cmd.equals("ALLCHAT")) {
			String id = packetObj.getString("id");
			String msg = packetObj.getString("msg");
			
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			ackObj.put("cmd", "ALLCHAT");
			ackObj.put("ack", "ok");
			String ack = ackObj.toString();
			pw.println(ack);
			pw.flush();
			
			// 전체 전송
			JSONObject broadObj = new JSONObject();
			broadObj.put("cmd", "BROADCHAT");
			broadObj.put("id", id);
			broadObj.put("msg", msg);
			String broadack = broadObj.toString();
			broadcast(broadack);
		}else if(cmd.equals("ONECHAT")) {
			String id = packetObj.getString("id");
			String youId = packetObj.getString("youId");
			String msg = packetObj.getString("msg");
			
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			ackObj.put("cmd", "ONECHAT");
			ackObj.put("ack", "ok");
			String ack = ackObj.toString();
			pw.println(ack);
			pw.flush();
			
			// 전체 전송
			JSONObject uniObj = new JSONObject();
			uniObj.put("cmd", "UNICHAT");
			uniObj.put("id", id);
			uniObj.put("msg", msg);
			String uniack = uniObj.toString();
			unicast(uniack, youId);
		}
		
	}
	
	private void unicast(String packet, String youId) throws IOException {
		Socket socket = (Socket) ht.get(youId);
		
		OutputStream out = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
		pw.println(packet);
		pw.flush();
	}
	
	private void broadcast(String packet) throws IOException {
		Set<String> idSet = ht.keySet();
		Iterator<String> idIter = idSet.iterator();
		while(idIter.hasNext()) {
			String id = idIter.next();
			Socket socket = (Socket) ht.get(id);
			
			if(socket == this.socket) {	// 본인한테는 보내지 않음
				continue;
			}
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			pw.println(packet);
			pw.flush();
		}
	}
	
	private double arith(String op, double val1, double val2) {
		double result = 0.;
		switch(op) {
		case "+":
			result = val1+val2;
			break;
		case "-":
			result = val1-val2;
			break;
		case "*":
			result = val1*val2;
			break;
		case "/":
			result = val1/val2;
			break;
		}
		return result;
	}
}