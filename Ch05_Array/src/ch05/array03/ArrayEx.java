package ch05.array03;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor = {98,99,89};
		System.out.println("배열의 크기: " + kor.length);
		
		int[] math = {100,80,78,68,90};
		System.out.println("배열의 크기: " + math.length);
		
		int[] eng = new int[] {100,80,78,90};
		System.out.println("배열의 크기: " + eng.length);
		
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(math));
		System.out.println(Arrays.toString(eng));
	}

}

