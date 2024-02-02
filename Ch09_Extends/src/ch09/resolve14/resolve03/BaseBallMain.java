package ch09.resolve14.resolve03;

import java.util.Arrays;

public class BaseBallMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneratorThreeNum g = new GeneratorThreeNum();
		BaseBallMenu b = new BaseBallMenu();
		DecisionBall d = new DecisionBall();
		
		boolean isRun = true;
		g.setAnswer();
		while(isRun) {
			System.out.println(Arrays.toString(g.getAnswer()));
			b.setAnswer();
			d.result(b.getAnswer(), g.getAnswer());
			if(b.viewResult(d.getResult()) == 3) {
				isRun = b.restart();
				g.setAnswer();
			}
		}
		System.out.println("게임이 종료되었습니다.");
	}

}
