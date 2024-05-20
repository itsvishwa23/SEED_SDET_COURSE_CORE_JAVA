package seed_sdet_course_core_java;

public class Day_7_Marketing_Excutive extends Day_7_Employee {

	int kms_travelled;
	int tour_allowance = 5;
	int telephone_allowance = 1500;
	int marketing_exe_salary;

	Day_7_Marketing_Excutive(int emp_id, String name, double basic_Sal, int kms_travelled) {
		super(emp_id, name, basic_Sal);
		this.kms_travelled = kms_travelled;
		calculate_me_salary();
	}

	public void calculate_me_salary() {

		marketing_exe_salary = (int) (basic_Sal + 5 * kms_travelled + telephone_allowance);

	}

	@Override
	public String toString() {
		super.toString();

		return super.toString() + " Marketing Executive Salary is : " + marketing_exe_salary;
	}

}
