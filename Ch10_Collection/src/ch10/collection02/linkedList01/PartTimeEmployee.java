package ch10.collection02.linkedList01;

public class PartTimeEmployee extends Employee{
	int dailyPay;
	int workDay;
	
	public PartTimeEmployee(String empno, String name, int dailyPay, int workDay) {
		super(empno, name);
		// TODO Auto-generated constructor stub
		this.dailyPay = dailyPay;
		this.workDay = workDay;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		double mPay = dailyPay*workDay;
		return mPay;
	}

	@Override
	public void showEmployeeInfo() {
		// TODO Auto-generated method stub
		super.showEmployeeInfo();
		System.out.println("dailyPay: " + dailyPay);
		System.out.println("workDay: " + workDay);
		System.out.printf("monthPay: %.2f\n", getMonthPay());
	}

	
}
