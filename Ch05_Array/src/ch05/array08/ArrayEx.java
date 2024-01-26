package ch05.array08;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[2];
		arr[2] = new int[2];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = i*3 + j;
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int[] temp : arr) {
			System.out.println(Arrays.toString(temp));
		}
	}

}

