package ch09.abstract11;

public class TempEmployee extends Employee{
	int yearSalary;
	int hireYear;
	
	public TempEmployee(String empno, String name, int yearSalary, int hireYear) {
		super(empno, name);
		// TODO Auto-generated constructor stub
		this.yearSalary = yearSalary;
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		double mPay = (double)yearSalary/12;
		return mPay;
	}

	@Override
	public void showEmployeeInfo() {
		// TODO Auto-generated method stub
		super.showEmployeeInfo();
		System.out.println("yearSalary: " + yearSalary);
		System.out.println("hireYear: " + hireYear);
		System.out.printf("monthPay: %.2f\n", getMonthPay());
	}
	
	
}
