package ch02.transtype05;

public class TransDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 297;
		int student = 4;
		double avg = 0;
		avg = (double)total/student; // 강제 형변환
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		
		int nAvg = (int)avg;
		System.out.println("평균 :" + nAvg);
		
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c);
		System.out.println((char)65); // char형 <=> int형 형변환
	}

}
