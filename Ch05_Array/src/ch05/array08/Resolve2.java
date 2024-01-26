package ch05.array08;

import java.util.Arrays;
import java.util.Scanner;

public class Resolve2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int j=0; j<arr.length; j++) {
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("최소값: " + arr[0]);
		System.out.println("최대값: " + arr[arr.length-1]);
	}

}
