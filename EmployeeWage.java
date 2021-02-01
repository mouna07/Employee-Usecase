import java.util.Random;
class EmployeeWage{
	public static void main(String args[]){
		System.out.println("Welocome to the Employee Wage problem");
		Random random=new Random();
		int isFullTime=1;
		int isPartTime=2;
		int wagePerHour=20;
		int fullTimeHour=8;
		int partTimeHour=4;
		int employeeWage;
		double empcheck=random.nextInt(3);
		if (empcheck==isFullTime){
			System.out.println("Employee is present and full time employee");
			employeeWage = wagePerHour*fullTimeHour;
			System.out.println("employee wage is:"+employeeWage);
		}
		else if(empcheck==isPartTime){
			System.out.println("Employee is present but part time employee");
			employeeWage = wagePerHour*partTimeHour;
			System.out.println("employee wage is:"+employeeWage);
		}
		else
			System.out.println("Employee is absent");
	}
}

