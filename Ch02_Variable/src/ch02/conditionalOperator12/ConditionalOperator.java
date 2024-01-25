package ch02.conditionalOperator12;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~100사이 숫자 입력");
		num = sc.nextInt();
		
		// 조건문
		if (num >= 85) {
			str = "상위권";
			System.out.println(str);
		} else {
			str = "상위권 아님";
			System.out.println(str);
		}
		
		// 삼항연산자
		str = num >= 85 ? "상위권" : "상위권아님";
		System.out.println(str);
		
		sc.close();
		
	}

}
