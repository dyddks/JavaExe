package ch03.for10;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		boolean tri;
		
		System.out.println("첫번째 값을 입력하세요");
		a = sc.nextInt();
		System.out.println("두번째 값을 입력하세요");
		b = sc.nextInt();
		System.out.println("세번째 값을 입력하세요");
		c = sc.nextInt();
		
		tri = a+b>=c && a+c>=b && b+c>=a ? true: false;
		System.out.println("삼각형 생성 가능성: " + tri);
	}

}
