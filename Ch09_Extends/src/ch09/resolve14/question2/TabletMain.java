package ch09.resolve14.question2;

public class TabletMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TabletTester tabletTester = new TabletTester();
		ITablet[] tabletArr = new ITablet[] {new SamsungTablet(), new LGTablet(), new SonyTablet()};
		int[] score = new int[tabletArr.length];
		
		for(int i=0; i<tabletArr.length; i++) {
			tabletTester.setTablet(tabletArr[i]);
			
			score[i] += tabletTester.movieTest();
			score[i] += tabletTester.musicTest();
			score[i] += tabletTester.readBookTest();
			
			System.out.printf("총 테스트 점수는 %d입니다.\n", score[i]);
			System.out.println("----------------------------");
		}
		
		int max = score[0];
		int maxIdx = 0;
		for(int i=1; i<score.length; i++) {
			if(max<score[i]) {
				max = score[i];
				maxIdx = i;
			}
		}
		
		System.out.printf("가장 높은 점수를 받은 태블릿은 %d번째 태블릿이고 점수는 %d입니다.\n", maxIdx+1, max);
		System.out.println(tabletArr[maxIdx].getClass().getName());
	}

}
