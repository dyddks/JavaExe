package ch09.extends06;

public class Gun {
	private int bullet;
	
	public Gun(int bullet) {
		this.bullet = bullet;
	}
	public void shot() {
		if(bullet>0) {
			System.out.println("BBANG!!");
			bullet--;
		}else {
			System.out.println("Chulkuk...");
		}
		
	}
}
