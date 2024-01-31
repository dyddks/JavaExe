package ch09.resolve07;

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
