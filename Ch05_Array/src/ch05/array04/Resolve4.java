package ch05.array04;

public class Resolve4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (i+1)*3;
		}
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
