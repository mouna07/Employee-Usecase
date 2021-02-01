class EmployeeWage{
	public static void main(String args[]){
		System.out.println("Welocome to the Employee Wage problem");
		int isFullTime=1;
		double empcheck=Math.floor(Math.random()*10)%2;
		if (empcheck==isFullTime)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
}

