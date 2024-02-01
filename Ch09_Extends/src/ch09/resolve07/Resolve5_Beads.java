package ch09.resolve07;

/* 클래스 설계에서 접근권한 설정
 * 1)필드 -> private
 * 2)메소드 -> public
 * 	메소드 중에 내부에서만 사용하는 메소드 -> private
 * */
public class Resolve5_Beads {
	private String name;
	private int beadsCnt;
	
	public Resolve5_Beads(int beads, String name) {
		this.name = name;
		beadsCnt = beads;
	}
	
	void win(Resolve5_Beads r, int beads) {
		r.lose(beads);
		beadsCnt += beads;
	}
	void lose(int beads) {
		beadsCnt -= beads;
	}
	
	void viewBeads() {
		System.out.println(name +" 남은 구슬 개수: " + beadsCnt);
	}
}
