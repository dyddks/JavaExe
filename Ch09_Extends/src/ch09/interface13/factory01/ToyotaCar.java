package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class ToyotaCar implements ICar {

	public void turnOn() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Toyota 시동이 부드럽게 잘걸린다.T");
		Thread.sleep((long)Math.random()*100);
	}

	@Override
	public void turnOff() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Toyota 시동이 부드럽게 잘 Off.T");
		Thread.sleep((long)Math.random()*100);
	}

	@Override
	public void accel() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Toyota 엑셀이 터보로 동작된다.H");
		Thread.sleep((long)Math.random()*100);
	}

	@Override
	public void footBreak() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Toyota 브레이크가 부드럽ㄱ-ㅔ 동작된다.T");
		Thread.sleep((long)Math.random()*100);
	}

}
