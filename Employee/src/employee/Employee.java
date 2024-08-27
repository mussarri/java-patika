package employee;

public class Employee {
	
	String name;
	int salary;
	int workHours;
	int hireYear;
	

	Employee(String name,int salary,int workHours,int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	double tax() { 
		if(this.salary< 1000) {
			return 0;
		}else {
			return salary*0.03;
			
		}
			
	}
	
	double bonus() {
		if(this.workHours > 40) {
			return (this.workHours - 40) * 30;
		}else {
			return 0;
		}
	}
	
	double raiseSalary(){
		if(2024 - this.hireYear < 10) {
			return this.salary * 0.05;
		}else if((2024 - this.hireYear) > 9 && (2024 - this.hireYear)<20) {
			return this.salary * 0.1;
		}else if(2024 - this.hireYear  > 19) {
			return this.salary * 0.15;
		}else {
			return 0;
		}
	}
	
	
	void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary + "$");
		System.out.println("Work hours: " + this.workHours);
		System.out.println("Start year: " + this.hireYear);
		System.out.println("Tax: " + this.tax());
		System.out.println("Bonus: " + this.bonus());
		System.out.println("Salary change: " + this.raiseSalary());
	}
	
	
	
	
}
