package ch15.thread02.syncerror09;

class Value{
	private int num = 0;
	
	public int getNum() {
		return num;
	}
	
	// 메서드 전체가 동기화가 필요할 때
	public synchronized void Increment() {
		// 아래 연산이 '스레드의 컨텍스트 스위칭'으로부터 보호되어야 한다.
		
		/* 아래 연산이 끝날때 까지 1개의 스레드만 접근해서 동작하도록 한다.
		 * 즉, 연산을 보호한다.
		 * 이 연산이 끝날때까지 Context Switching이 일어나지 않는다.
		 **/
		num++;
	}
}

class IncThread extends Thread{
	private Value val;
	
	public IncThread(Value val) {
		this.val = val;
	}
	
	@Override
	public void run() {
		for(int i=0; i<100000; i++) {
			val.Increment();
		}
	}
}

public class ThreadSyncError {
	public static void main(String[] args) {
		Value val = new Value();
		IncThread it1 = new IncThread(val);
		IncThread it2 = new IncThread(val);
		
		it1.start();
		it2.start();
		
		try {
			it1.join();
			it2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(val.getNum());
	}
}
