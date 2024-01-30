package ch06.method01;

import java.util.Scanner;

public class Resolve1 {
	//작은값 반환 메소드
	public static int min(int[] num) {
		int min = num[0]<num[1]? num[0]: num[1];

		return min;
	}
	
	//큰값 반환 메소드
	public static int max(int[] num) {
		int max = num[0]>num[1]? num[0]: num[1];
		return max;
	}
	
	// 정수 입력 메소드
	public static int[] input() {
		int[] num = new int[2];
		Scanner sc = new Scanner(System.in);
		
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		
		return num;
	}
	
	// 결과 출력 메소드
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
