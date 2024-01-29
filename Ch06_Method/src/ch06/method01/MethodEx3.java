package ch06.method01;

import java.util.Scanner;

public class MethodEx3 {
	public static int add(int num0, int num1) {
		int result = num0 + num1;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num0 = 10, num1 = 5;
		int result = add(num0,num1);
		System.out.println("결과값은 " + result);
		
		int a = 3, b = 7;
		int result1 = add(a,b);
		System.out.println("결과값은 " + result1);
	}

}
