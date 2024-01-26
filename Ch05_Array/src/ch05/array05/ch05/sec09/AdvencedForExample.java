package ch05.array05.ch05.sec09;

public class AdvencedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {95,71,84,93,87};
		int sum = 0;
		for(int score: scores) {
			sum = sum+score;
		}
		System.out.println("점수총합: " + sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("점수평균: " + avg);
	}

}
