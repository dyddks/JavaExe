package ch09.resolve14;

public class GeneratorThreeNum {
	int[] cor_answer;
	
	public void setAnswer() {
		cor_answer = new int[3];
		cor_answer[0] = (int)(Math.random()*10);
		int i = 1;
		while(true) {
			cor_answer[i] = (int)(Math.random()*10);
			if(cor_answer[i] != cor_answer[i-1]) {
				i++;
			}
			if(i == 3) {
				break;
			}
		}
	}
	
	public int[] getAnswer() {
		return cor_answer;
	}
}
