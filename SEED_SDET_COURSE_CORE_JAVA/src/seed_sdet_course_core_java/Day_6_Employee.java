package seed_sdet_course_core_java;

public class Day_6_Employee {
	int da;
	int basic_Salary;
	String name;
	int id;
	int salary;

	public Day_6_Employee() {

		basic_Salary = 20000;
		name = "Vishwanath";
		id = 101;
		da = 200;

	}

	Day_6_Employee(int basic_Salary, String name, int id)

	{
		this.da = 500;
		this.basic_Salary = basic_Salary;
		this.name = name;
		this.id = id;

	}

	public int calculate() {

		salary = basic_Salary + da;
		return salary;

	}

	public void display() {

		System.out.println("The Name of the employee is:" + name + "The Salary is:" + salary);

	}

}
