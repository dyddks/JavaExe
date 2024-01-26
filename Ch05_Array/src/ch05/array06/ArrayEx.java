package ch05.array06;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {100,88,95,67,75};
		int[] scores1 = scores;
		int[] scores2 = scores1;
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores1));
		System.out.println(Arrays.toString(scores2));
		System.out.println(scores);
		System.out.println(scores1);
		System.out.println(scores2);
		
		int[] scores4 = Arrays.copyOf(scores1, scores1.length);
		System.out.println(Arrays.toString(scores4));
		System.out.println(scores4);
	}

}

