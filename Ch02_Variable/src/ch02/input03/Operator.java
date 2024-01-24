package ch02.input03;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 0;
		int n0 = 0, n1 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("더하기 연산");
		System.out.println("1번째 숫자");
		n0 = sc.nextInt();
		System.out.println("2번째 숫자");
		n1 = sc.nextInt();
		
		r = n0+n1;
		System.out.println("결과는: " + r);
		
		sc.close();
	}

}
