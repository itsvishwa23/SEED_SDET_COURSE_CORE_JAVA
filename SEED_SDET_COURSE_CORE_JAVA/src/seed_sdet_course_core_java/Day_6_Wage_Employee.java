package seed_sdet_course_core_java;

public class Day_6_Wage_Employee extends Day_6_Employee {
	int total_salary;
	int hours;
	float rate;

	public Day_6_Wage_Employee() {
		this.hours = 12;
		this.rate = 25;
	}

	public Day_6_Wage_Employee(int hours, float rate) {
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public void calculate() {
		super.calculate();
		total_salary = (int) (salary + (hours * rate));
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Total salary for Wage Employee is: " + total_salary);
	}
}
