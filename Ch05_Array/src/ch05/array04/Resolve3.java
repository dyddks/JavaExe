package ch05.array04;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] grade = new int[7];

		for(int i=0; i<grade.length; i++) {
			System.out.print("학점을 입력하세요 >> ");
			grade[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<grade.length; i++) {
			sum += grade[i];
		}
		
		System.out.print("총점 >> " + sum);
		double avg = (double)sum/grade.length;
		System.out.printf("평균 >> %.2f", avg);
	}

}
