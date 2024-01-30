package ch06.method01;

import java.util.Scanner;

public class Resolve2 {

	public static void abs(int num0, int num1) {
		int result = 0;
		
		result = num0-num1;
			
		System.out.println("두수의 차의 절댓값: " + Math.abs(result));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num0 = sc.nextInt();
		int num1 = sc.nextInt();
		sc.close();
		
		abs(num0, num1);
	}

}
