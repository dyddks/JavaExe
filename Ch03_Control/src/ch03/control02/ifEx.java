package ch03.control02;

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
		} else {
			System.out.println("A는 아닙니다.");
		}
		
		sc.close();
	}

}
