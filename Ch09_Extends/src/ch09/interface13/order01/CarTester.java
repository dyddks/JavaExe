package ch09.interface13.order01;

import ch09.interface13.ICar;

public class CarTester {
	private final int TEST_NUM = 3;
	private ICar car;
	
	/* 외부에서 주입
	 * CarTest는 ICar에 의존적이다.
	 * */
	public CarTester(ICar car) {
		this.car = car;
	}

	public void setCar(ICar car) {
		this.car = car;
	}
	
	public int onOffTest() {
		for(int i=0; i<TEST_NUM; i++) {
			car.turnOn();
			car.turnOff();
		}
		return (int)Math.random()*50 + 50;	// 50~99
	}
	public int speedTest() {
		for(int i=0; i<TEST_NUM; i++) {
			car.accel();
			car.accel();
			car.accel();
		}
		return (int)Math.random()*50 + 50;
	}
	public int footBreakTest() {
		for(int i=0; i<TEST_NUM; i++) {
			car.accel();
			car.footBreak();
			car.footBreak();
			car.footBreak();
		}
		return (int)Math.random()*50 + 50;
	}
	public int driveTest() {
		for(int i=0; i<TEST_NUM; i++) {
			car.turnOn();
			car.accel();
			car.accel();
			car.footBreak();
			car.footBreak();
			car.footBreak();
		}
		return (int)Math.random()*50 + 50;
	}
}