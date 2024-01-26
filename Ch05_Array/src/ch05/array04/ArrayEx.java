package ch05.array04;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"홍길동", "임꺽정", "장길산", "일지매"};
		
		System.out.println(Arrays.toString(names));
		for(int i=0; i<names.length;i++) {
			System.out.print(names[i]+" ");
		}
	}

}

