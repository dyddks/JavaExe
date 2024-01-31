package ch09.resolve07;

import java.util.Arrays;

public class Resolve4_ArrayUtility2 {
	static int[] concat(int[] s1, int[] s2) {
		int[] concatArr = new int[s1.length+s2.length];
		
		for(int i=0; i<s1.length; i++) {
			concatArr[i] = s1[i];
		}
		for(int i=0; i<s2.length; i++) {
			concatArr[i+s1.length] = s2[i];
		}
		
		return concatArr;
	}
	
	static int[] remove(int[] s1, int[] s2) {
		int[] tempArr = Arrays.copyOf(s1, s1.length);
		int cnt = 0;
		for(int i=0; i<s1.length; i++) {
			for(int num: s2) {
				if(tempArr[i] == num) {
					tempArr[i] = 0;
					cnt++;
				}
			}
		}
		
		int[] removeArr = new int[s1.length-cnt];
		
		int i=0;
		for(int num: tempArr) {
			if(num != 0) {
				removeArr[i] = num;
				i++;
			}
		}
		
		return removeArr;
	}
}
