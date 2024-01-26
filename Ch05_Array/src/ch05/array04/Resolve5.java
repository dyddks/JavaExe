package ch05.array04;

import java.util.Scanner;

public class Resolve5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println(sum);
	}

}
