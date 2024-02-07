package ch10.collection02.linkedList03;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManeger {
	// Employee의 자식 객체들을 저장
	private List<Employee> empList = new LinkedList<Employee>();
	private Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 사번으로 검색");
		System.out.println("9. 사원 정보 수정");
		System.out.println("10. 사원 정보 삭제");
		System.out.println("11. 종료");
		System.out.print("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}
	
	private RegularEmployee createRegularEmployee(){
		System.out.print("사번 >> ");
		String empNo = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary  = sc.nextInt();
		System.out.print("보너스 >> ");
		int bonus = sc.nextInt();
		RegularEmployee emp= new RegularEmployee(empNo, name, yearSalary, bonus);
		return emp;
	}
	
	private TempEmployee createTempEmployee(){
		System.out.print("사번 >> ");
		String empNo = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary  = sc.nextInt();
		System.out.print("계약 기간 >> ");
		int hireYear = sc.nextInt();
		TempEmployee emp= new TempEmployee(empNo, name, yearSalary, hireYear);
		return emp;
	}
	
	private PartTimeEmployee createPartTimeEmployee(){
		System.out.print("사번 >> ");
		String empNo = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("일급 >> ");
		int dailyPay  = sc.nextInt();
		System.out.print("출근 일수 >> ");
		int workDay = sc.nextInt();
		PartTimeEmployee emp= new PartTimeEmployee(empNo, name, dailyPay, workDay);
		return emp;
	}
	
	private void saveEmployee(Employee emp) {
		empList.add(emp);
//		boolean isSave = true;
//		if(this.numOfEmp < EMP_NUM) {
//			this.empArr[this.numOfEmp] = emp;
//			this.numOfEmp++;
//			isSave = true;
//		}else {
//			isSave = false;
//		}
//		return isSave;
	}
	
	private void viewAllEmployeeInfo() {
		for(Employee emp : empList) {
			emp.showEmployeeInfo();
		}
	}
	private void viewRegEmployeeInfo() {
		for(Employee emp : empList) {
			if(emp instanceof RegularEmployee) {
				emp.showEmployeeInfo();
			}
		}
	}
	private void viewTempEmployeeInfo() {
		for(Employee emp : empList) {
			if(emp instanceof TempEmployee) {
				emp.showEmployeeInfo();
			}
		}
	}
	private void viewPartEmployeeInfo() {
		for(Employee emp : empList) {
			if(emp instanceof PartTimeEmployee) {
				emp.showEmployeeInfo();
			}
		}
	}
	
	private void search() {
		System.out.print("사번 입력 >> ");
		String empNo = sc.next();
		for(Employee emp : empList) {
			if(emp.empno.equals(empNo)) {
				emp.showEmployeeInfo();
			}
		}
	}
	
	private void update() {
		System.out.print("사번 입력 >> ");
		String empNo = sc.next();
		for(Employee emp : empList) {
			if(emp.empno.equals(empNo)) {
				if(emp instanceof RegularEmployee) {
					System.out.print("이름 입력 >> ");
					String name = sc.next();
					System.out.print("연봉 입력 >> ");
					int yearSalary = sc.nextInt();
					System.out.print("보너스 입력 >> ");
					int bonus = sc.nextInt();
					((RegularEmployee) emp).updateInfo(name, yearSalary, bonus);
					System.out.println("사원정보가 수정 되었습니다.");
				}else if(emp instanceof TempEmployee) {
					System.out.print("이름 입력 >> ");
					String name = sc.next();
					System.out.print("연봉 입력 >> ");
					int yearSalary = sc.nextInt();
					System.out.print("계약기간 입력 >> ");
					int hireYear = sc.nextInt();
					((TempEmployee) emp).updateInfo(name, yearSalary, hireYear);
					System.out.println("사원정보가 수정 되었습니다.");
				}else if(emp instanceof PartTimeEmployee) {
					System.out.print("이름 입력 >> ");
					String name = sc.next();
					System.out.print("일당 입력 >> ");
					int dailyPay = sc.nextInt();
					System.out.print("출근일수 입력 >> ");
					int workDay = sc.nextInt();
					((PartTimeEmployee) emp).updateInfo(name, dailyPay, workDay);
					System.out.println("사원정보가 수정 되었습니다.");
				}	
			}
		}
	}
	
	private void delete() {
		System.out.print("사번 입력 >> ");
		String empNo = sc.next();
		for(Employee emp : empList) {
			if(emp.empno.equals(empNo)) {
				empList.remove(emp);
				System.out.println("사원 정보가 삭제되었습니다.");
			}
		}
	}
	
	public void run() {
		boolean isRun = true;
		
		while(isRun) {
			int selNum = viewMenu();
			Employee emp = null;
			
			switch(selNum) {
			case EmpMenu.REG_EMP:
				emp = createRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP:
				emp = createTempEmployee();
				break;
			case EmpMenu.PART_EMP:
				emp = createPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO:
				emp = null;
				viewAllEmployeeInfo();
				break;
			case EmpMenu.REG_INFO:
				viewRegEmployeeInfo();
				break;
			case EmpMenu.TEMP_INFO:
				viewTempEmployeeInfo();
				break;
			case EmpMenu.PART_INFO:
				viewPartEmployeeInfo();
				break;
			case EmpMenu.SEARCH:
				search();
				break;
			case EmpMenu.UPDATE:
				update();
				break;
			case EmpMenu.DELETE:
				delete();
				break;
			case EmpMenu.EXIT:
				emp = null;
				isRun = false;
				break;
			default:
				emp = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}
			
			if(emp != null) {
//				boolean isSave = saveEmployee(emp);
//				if(!isSave) {
//					System.out.println("더 이상 저장 공간이 없습니다.");
//				}
				saveEmployee(emp);
			}
		}
		System.out.println("Program Exit...");
	}
}
