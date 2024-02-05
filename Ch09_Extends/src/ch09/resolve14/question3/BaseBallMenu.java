package ch09.resolve14.question3;

import java.util.*;

public class BaseBallMenu {
	int[] answer = new int[3];
	Scanner sc = new Scanner(System.in);
	
	public void setAnswer() {
		System.out.print("첫번째 숫자 입력 >> ");
		answer[0] = sc.nextInt();
		System.out.print("두번째 숫자 입력 >> ");
		answer[1] = sc.nextInt();
		System.out.print("세번째 숫자 입력 >> ");
		answer[2] = sc.nextInt();
	}
	public int[] getAnswer() {
		return answer;
	}
	public int viewResult(int[] result) {
		System.out.printf("==> %d스트라이크 %d볼\n", result[0], result[1]);
		return result[0];
	}
	public boolean restart() {
		System.out.print("다시하시겠습니까(Y/N)? ");
		String re = sc.next();
		if("Y".equals(re)) {
			return true;
		}else {
			return false;
		}
		
	}
}
