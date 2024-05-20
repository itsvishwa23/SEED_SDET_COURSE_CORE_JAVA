package seed_sdet_course_core_java;

public class Day_7_Employee {

	int emp_id;
	String name;
	double basic_Sal;

	public Day_7_Employee() {

		this.emp_id = 101;
		this.name = "Vishwanath";
		this.basic_Sal = 50005.5;

	}

	public Day_7_Employee(int emp_id, String name, double basic_Sal) {

		this.emp_id = emp_id;
		this.name = name;
		this.basic_Sal = basic_Sal;

	}

	@Override
	public String toString() {

		return " The Employee id is: " + emp_id + " The name is:" + name + " The basic salary is :" + basic_Sal;
	}

}
