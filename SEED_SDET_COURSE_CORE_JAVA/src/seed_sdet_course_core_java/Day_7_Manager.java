package seed_sdet_course_core_java;

public class Day_7_Manager extends Day_7_Employee {

	double petrol_allowance;
	double food_allowance;
	double other_allowance;
	double manager_salary;

	Day_7_Manager(int emp_id, String name, double basic_Sal) {

		super(emp_id, name, basic_Sal);

		calculate_m_salary();

	}

	public void calculate_m_salary() {

		manager_salary = 0.8 * basic_Sal + 0.13 * basic_Sal + 0.3 * basic_Sal;

	}

	@Override
	public String toString() {

		return super.toString() + " Manager Salary is :  " + manager_salary + " ";
	}
}
