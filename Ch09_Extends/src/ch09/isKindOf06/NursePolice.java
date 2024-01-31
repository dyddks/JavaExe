package ch09.extends06;

public class NursePolice extends Police{
	private int thermometer;	//체온계 개수
	
	public NursePolice(int bullet, int handCuffs, int thermometer) {
		super(bullet, handCuffs);
		this.thermometer = thermometer;
	}
	public void calcThermometer() {
		if(thermometer>0) {
			System.out.println("Check 36.5 Temp");
			thermometer--;
		}else {
			System.out.println("No Check Temp");
		}
		
	}
}
