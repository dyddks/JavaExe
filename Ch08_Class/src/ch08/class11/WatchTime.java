package ch08.class11;

/* 필드는 객체별로 독립적으로 존재
 * 메소드는 처음 객체를 생성할때 한번 메모리에 올라가고 이후에 생성된 모든 객체가 공유
 * 
 * 어떤 객체가 메소드를 호출했는지에 대한 정보가 필요
 * this => 메소드를 호출한 객체에 대한 레퍼런스정보가 들어있음
 * */
public class WatchTime {
	private int hour, min, sec;
	
	public WatchTime(int hour,int min, int sec) {
		System.out.println("this: " + this);
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	public void viewTime() {
		System.out.printf("[%02d:%02d:%02d]\n", hour,min,sec);
	}
	
	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		System.out.println("wtNum: " + wtNum);
		System.out.printf("wtNum: %x\n", wtNum.hashCode());
		wtNum.viewTime();
		
		WatchTime wtNum1 = new WatchTime(13, 23, 33);
		System.out.println("wtNum1: " + wtNum1);
		System.out.printf("wtNum1: %x\n", wtNum1.hashCode());
		wtNum1.viewTime();
	}
}