package ch09.extends04;

public class GrandFather {
	int handsomeScore;
	
	GrandFather(){
		System.out.println("GrandFather 생성자");
	}
	GrandFather(int score){
		handsomeScore = score;
		System.out.println("GrandFather 매개변수 생성자");
	}
	void hansome() {
		System.out.println("잘생김");
	}
}
