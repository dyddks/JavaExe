package ch09.resolve14;

import java.util.Scanner;

import ch09.resolve14.question1.Answer1;
import ch09.resolve14.question2.Answer2;
import ch09.resolve14.question3.Answer3;

public class QuestionMain {
	IQuestionAnswer[] qaArr = { new Answer1(), new Answer2(), new Answer3(), new Exit()};
	
	public int getSelectQuestion(Scanner sc) {
		System.out.print("\n\n메뉴 번호 선택 >> ");
		int num = sc.nextInt();
		return num;
	}
	
	public void printQuestion() {
		for(int i=0; i<qaArr.length; i++) {
			qaArr[i].question();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		QuestionMain qm = new QuestionMain();
		boolean isRun = true;
		
		while(isRun) {
			qm.printQuestion();
			int sel = qm.getSelectQuestion(sc);
			
			if(sel>=1 && sel<=qm.qaArr.length) {					
				IQuestionAnswer iqa = qm.qaArr[sel-1];
				iqa.answer(sc);
				isRun = iqa.isRun();
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		System.out.println("Program End");
		sc.close();
	}
}
