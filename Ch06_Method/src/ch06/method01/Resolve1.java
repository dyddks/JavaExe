package ch06.method01;

import java.util.Scanner;

public class Resolve1 {

	public static int min(int[] num) {
		int min = Math.min(num[0], num[1]);

		return min;
	}
	
	public static int max(int[] num) {
		int max = Math.max(num[0], num[1]);
		return max;
	}
	
	public static int[] input() {
		int[] num = new int[2];
		Scanner sc = new Scanner(System.in);
		
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		
		return num;
	}
	public static void view(int min, int max) {
		System.out.printf("작은값: %d, 큰값: %d", min, max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = input();
		
		int min = min(num);
		int max = max(num);
		
		view(min, max);
	}

}
