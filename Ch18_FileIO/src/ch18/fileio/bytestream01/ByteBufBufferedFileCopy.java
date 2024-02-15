package ch18.fileio.bytestream01;

import java.io.*;

/* 1byte씩 파일에서 읽어서 저장하는 방식은 너무 느림
 * 이것을 개선하려면 3가지
 * 1) 한번에 많이 읽기
 * 2) jdk 입력 버퍼 클래스를 사용해서 미리 읽어들인 것을 1byte씩 가져오고
 * 	다시 출력 버퍼 클래스에 1byte씩 저장하면 알아서 파일에 한꺼번에 저장
 * 3) 1번과 2번을 합치기
 * */
/* 물류 시스템과 동일
 * 하드디스크 (물류센터)
 * App 프로세스 (아파트)
 * 택배 차량 (버퍼 클래스)
 * */
public class ByteBufBufferedFileCopy {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("힐링.mp4");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		OutputStream out = new FileOutputStream("힐링2.mp4");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		long copyByte = 0;
		int readLen = 0;
		byte[] buf = new byte[1024*10];
		long stime = System.currentTimeMillis();
		
		while(true) {
			readLen = bin.read(buf);
			if(readLen == -1) {
				break;
			}
			bout.write(buf, 0, readLen);
			copyByte++;
		}
		
		long etime = System.currentTimeMillis();
		bin.close();
		bout.close();
		System.out.println("복사시간 = " + (etime-stime));
		System.out.println("복사된 바이트 크기: " + copyByte);
	}
}
