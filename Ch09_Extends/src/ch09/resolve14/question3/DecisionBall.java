package ch09.resolve14.question3;

public class DecisionBall {
	int[] result = new int[2];
	
	public void result(int[] answer, int[] cor_answer) {
		result[0] = 0;	// strike
		result[1] = 0;	// ball
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(answer[i]==cor_answer[j] && i==j) {
					result[0]++;
				}else if(answer[i]==cor_answer[j] && i!=j) {
					result[1]++;
				}
			}
		}
	}
	
	public int[] getResult() {
		return result;
	}
	
}
