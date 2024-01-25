package ch03.control01;

import java.util.Scanner;

public class ifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~100 점수입력 >>");
		score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A학점");
		}
		
		sc.close();
	}

}
