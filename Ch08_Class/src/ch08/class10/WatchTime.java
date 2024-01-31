package ch08.class10;

/* 메소드(함수) 오버로딩(Overloading)
 * java는 함수의 이름은 동일하지만 매개변수가 다른 함수를 여러개 만들 수 있다.
 * */
public class WatchTime {
	private int hour, min, sec;
	private String strHour, strMin, strSec;
	private boolean isNum = true;
	
	public WatchTime(int hour,int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
		isNum = true;
	}
	public WatchTime(String strHour, String strMin, String strSec) {
		this.strHour = strHour;
		this.strMin = strMin;
		this.strSec = strSec;
		isNum = false;
	}
	public void viewTime() {
		if(isNum) {
			System.out.printf("[%02d:%02d:%02d]\n", hour,min,sec);
		}else {
			System.out.printf("- %s %s %s -\n", strHour,strMin,strSec);
		}
	}
	
	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		wtNum.viewTime();
		
		WatchTime wtStr = new WatchTime("열두시", "이십분", "오십초");
		wtStr.viewTime();
	}
}