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

		this.hours = 12;
		this.rate = 25;

	}

	public int calculate() {

		total_salary = basic_Salary + da * 12 * 25;
		return total_salary;

	}

}
