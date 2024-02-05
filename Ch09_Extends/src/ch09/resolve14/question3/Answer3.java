package ch09.resolve14.question3;

import java.util.Scanner;

import ch09.resolve14.IQuestionAnswer;

public class Answer3 implements IQuestionAnswer {

	@Override
	public void question() {
		String question = "3. 삼진아웃게임을 만듭니다\r\n"
				+ "두 사람중에 한 사람이 0~9까지 3개의 숫자중 중복없이 임의의 숫자를 선택합니다\r\n"
				+ "예를 들어 3 1 9를 선택했다면\r\n"
				+ "다른 한사람이 3개의 숫자를 맞추고 결과를 응답받습니다\r\n"
				+ "같은 숫자 동일한 자리일 경우 1스트라이크\r\n"
				+ "같은 숫자 다른 자리일 경우 1볼입니다\r\n"
				+ "세자리 숫자 모두 자리까지 일치할 경우는 삼진아웃!!으로 처리합니다\r\n"
				+ "\r\n"
				+ "클래스를 구현하세요\r\n"
				+ "GeneratorThreeNum // 난수 3개를 생성하는 역할\r\n"
				+ "BaseBallMenu      // 메뉴를 담당하는 역할\r\n"
				+ "DecisionBall      // 스트라이크, 볼을 판단하는 역할\r\n"
				+ "BaseBallMain	  // main메서드를 실행하는 역할";
		
		System.out.println(question);

	}

	@Override
	public void answer(Scanner sc) {
		sc.nextLine();
		System.out.println("3번 문제 실행");

	}

	@Override
	public boolean isRun() {
		// TODO Auto-generated method stub
		return true;
	}

}
