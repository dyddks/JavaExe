package ch05.array08;

import java.util.Arrays;

public class Resolve3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		for(int i=0; i<arr.length/2; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length-(i+1)];
			arr[arr.length-(i+1)] = tmp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
