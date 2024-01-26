package ch05.array02;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] kor = new int[3];
		
		for(int i=0; i<kor.length; i++) {
			System.out.println(i+1 + "번째 학생 국어점수 입력 >> ");
			kor[i] = sc.nextInt();
		}
		int total = 0;
		for(int i=0; i<kor.length; i++) {
			total += kor[i];
		}
		double avg = (double)(total/3);
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		
	}

}
