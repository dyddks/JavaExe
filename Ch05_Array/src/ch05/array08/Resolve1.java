package ch05.array08;

import java.util.Arrays;
import java.util.Scanner;

public class Resolve1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("최소값: " + arr[0]);
		System.out.println("최대값: " + arr[arr.length-1]);
	}

}
