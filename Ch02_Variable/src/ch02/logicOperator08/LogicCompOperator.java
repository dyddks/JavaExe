package ch02.logicOperator08;

import java.util.Scanner;

public class LogicCompOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		String pass;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 시험점수는 (0~100)>>");
		score = sc.nextInt();
		System.out.println("당신의 면접의 분위기는? (화목/공격) >> ");
		pass = sc.next();
		
		if (score >= 90 && pass.equals("화목") == true) {
			System.out.println("당신은 합격입니다.");
		} else {
			System.out.println("당신은 불합입니다.");
		}
		
		sc.close();
	}

}
