package ch18.fileio.bytestream01;

import java.io.*;

/* 바이너리 파일(기계어로 된 파일) => 메모장에서 열면 깨져 보인다.
 * ; 이미지, 영상, 실행파일 ...
 * 
 * 메모리의 변수값을 바이너리 파일로 저장시
 * 바이트 스트림 Class와 함께
 * Filter Class를 사용하면 편리하다.
 * */
public class DataFilterStream {
	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("data.bin");
		
		// 필터 클래스 (변수값 저장에 편리한 기능 제공)
		DataOutputStream filterOut = new DataOutputStream(out);
		
		// 저장할 변수
		int num = 365;
		double pi = 3.14;
		
		// data.bin에 저장
		filterOut.writeInt(num);
		filterOut.writeDouble(pi);
		filterOut.close();
		
		// 입력스트림을 생성해서 읽어들이기
		InputStream in = new FileInputStream("data.bin");
		DataInputStream filterIn = new DataInputStream(in);
		
		int inNum = filterIn.readInt();
		Double inPi = filterIn.readDouble();
		filterIn.close();
		
		System.out.println("inNum=" + inNum);
		System.out.println("inPi=" + inPi);
	}
}
