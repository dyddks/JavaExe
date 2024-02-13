package ch15.thread02;

/* [스레드 생성 요청하는 2가지 방법]
 * vm에 내부에 스레드의 리소스가 존재하고
 * 우리는 객체의 참조 변수로 스레드의 동작을 제어한다.
 * 1) Thread클래스의 상속받는 클래스 구현
 * 2) Runnable 인터페이스의 상속받는 클래스 구현
 * 	이미 다른 클래스의 상속을 받은 클래스에서 스레드를 동작시키려면
 * 	Thread클래스를 더이상 상속시킬수 없다.
 * 	java는 단일 상속이기 때문
 * 	그래서 이미 다른 클래스를 상속받은 클래스에서 스레드를 동작시키기 위해
 * 	Runnable인터페이스를 상속받는 방법을 제시했다.
 * 
 * 모두 run()에 스레드가 해야할 일을 구현한다.
 * start()를 호출하면 스레드가 동작을 시작한다.
 * */

class OwnName{
	private String ownName;
	
	public String getOwnName() {
		return ownName;
	}

	public void setOwnName(String ownName) {
		this.ownName = ownName;
	}
}

/* ShowNameThread는 이미 OwnName을 상속받았으므로
 * Thread의 상속을 받을 수 없다.
 * 이 때는 Runnable을 상속받는다.
 * */
class ShowOwnNameThread extends OwnName implements Runnable{
	
	public ShowOwnNameThread(String ownName) {
		this.setOwnName(ownName);
	}
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(i + "안녕하세요 : " + this.getOwnName() + "입니다.");
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.getOwnName() + "스레드 종료");
	}
}
public class ImplementsRunnable {
	public static void main(String[] args) {
		// Thread 2개가 vm에 할당되어 준비하고 있는 상태
		ShowOwnNameThread s1 = new ShowOwnNameThread("철수");
		ShowOwnNameThread s2 = new ShowOwnNameThread("영희");
		ShowOwnNameThread s3 = new ShowOwnNameThread("은하");
		ShowOwnNameThread s4 = new ShowOwnNameThread("철희");
		
		// 스레드를 동작(run()을 호출)
		System.out.println("t1 스레드 동작");
		Thread t1 = new Thread(s1); t1.start();
		System.out.println("t2 스레드 동작");
		Thread t2 = new Thread(s2); t2.start();
		System.out.println("t3 스레드 동작");
		Thread t3 = new Thread(s3); t3.start();
		System.out.println("t4 스레드 동작");
		Thread t4 = new Thread(s4); t4.start();
		System.out.println("main 스레드 종료");
	}
}
