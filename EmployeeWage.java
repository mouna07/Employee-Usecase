import java.util.Random;
class EmployeeWage{
	public static void main(String args[]){
		System.out.println("Welocome to the Employee Wage problem");
		Random random=new Random();
		int workingDaysInMonth=20;
		int wagePerHour=20;
		int employeeWage=0;
		int totalEmpWage=0;
		for(int day=1;day<=20;day++)
		{
			int emphrs=0;
			int empcheck=random.nextInt(3);
			switch(empcheck)
			{
			case 1:
				emphrs=8;
				break;
			case 2:
				emphrs=4;
				break;
			default:
				emphrs=0;
				break;
			}
		employeeWage = wagePerHour*emphrs;
		totalEmpWage = employeeWage + totalEmpWage;
		}
		System.out.println("Employee wage for Month="+totalEmpWage);

	}
}
