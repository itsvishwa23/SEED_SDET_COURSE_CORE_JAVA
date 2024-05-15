package seed_sdet_course_core_java;

public class Day_4_Employee {

	public static int emp_id;
	String emp_name;
	float salary;

	int temp;

	static {

		emp_id = 1001;

	}

	public void init(String Nme, float sal) {

		temp = emp_id + 1;
		emp_name = Nme;
		salary = sal;

		emp_id = emp_id + 1;

	}

	public void display() {

		System.out.println(temp);
		System.out.println(emp_name);
		System.out.println(salary);

	}

}
