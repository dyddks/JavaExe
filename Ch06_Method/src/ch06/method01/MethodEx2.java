package ch06.method01;

import java.util.Scanner;

public class MethodEx2 {
	// 계산하는 메소드
	public static void calcArith(int num0, int num1, String op) {
		int result = 0;
	
		switch (op) {
		case "+":
			result = num0 + num1;
			break;
		case "-":
			result = num0 - num1;
			break;
		case "*":
			result = num0 * num1;
			break;
		case "/":
			result = num0 / num1;
			break;
		case "%":
			result = num0 % num1;
			break;
		default: 
			System.out.println("연산이 불가능 합니다.");
		}
		// 3) 결과값 출력
		System.out.println("결과값은" + result + "입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 1) 입력받는 부분
		System.out.println("1번째 정수 입력 >>");
		int num0 = sc.nextInt();
		System.out.println("2번째 정수 입력 >>");
		int num1 = sc.nextInt();
		System.out.println("연산자 입력(+, -, *, /, %) >> ");
		String op = sc.next();
		
		calcArith(num0, num1, op);
	}

}
