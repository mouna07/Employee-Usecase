class EmployeeWage{
	public static void main(String args[]){
		System.out.println("Welocome to the Employee Wage problem");
		int isFullTime=1;
		int wagePerHour=20;
		int fullDayHour=8;
		double empcheck=Math.floor(Math.random()*10)%2;
		if (empcheck==isFullTime){
			System.out.println("Employee is present");
			int employeeWage = wagePerHour*fullDayHour;
			System.out.println("employee wage is:"+employeeWage);
		}
		else
			System.out.println("Employee is absent");
	}
}

