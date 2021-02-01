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
		int empcheck=random.nextInt(3);
		switch(empcheck)
		{
		case 1:
				System.out.println("Employee is present and full time employee");
				employeeWage = wagePerHour*fullTimeHour;
				System.out.println("employee wage is:"+employeeWage);
				break;
		case 2:
				System.out.println("Employee is present but part time employee");
				employeeWage = wagePerHour*partTimeHour;
				System.out.println("employee wage is:"+employeeWage);
				break;
		default:
				System.out.println("Employee is absent");
		}
	}
}
