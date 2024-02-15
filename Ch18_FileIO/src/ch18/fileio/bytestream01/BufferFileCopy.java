package ch18.fileio.bytestream01;

import java.io.*;

public class BufferFileCopy {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("cat.png");
		
		OutputStream out = new FileOutputStream("고양이.png");
		
		int copyByte = 0;
		int readLen;
		byte[] buf = new byte[1024];
		long stime = System.currentTimeMillis();
		
		while(true) {
			readLen = in.read(buf); 
			if(readLen == -1) {
				break;
			}
			out.write(buf, 0, readLen);	// buf에서 실제 읽어들인 크기만큼 저장
			copyByte += readLen;		// 읽어들인 크기를 누적
		}
		long etime = System.currentTimeMillis();
		
		in.close();
		out.close();
		System.out.println("복사시간 = " + (etime-stime));
		System.out.println("복사된 바이트 크기: " + copyByte);
	}
}
