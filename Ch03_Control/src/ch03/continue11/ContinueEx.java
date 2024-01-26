package ch03.continue11;

public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++) {
			System.out.printf("3*%d=%d\n", i, 3*i);
		}
		
		System.out.println();
		
		for(int i=1; i<=9;i++) {
			if(i>5) {
				continue;
			}
			
			System.out.printf("3*%d=%d\n", i, 3*i);
		}
	}

}
