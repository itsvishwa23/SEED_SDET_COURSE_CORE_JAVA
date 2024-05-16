package seed_sdet_course_core_java;

public class Day_5_Employee {

	String name;
	int id;
	float salary;
	Day_5_Date doj;

	public void init(String nme, int i, float sal, Day_5_Date dj) {

		name = nme;
		id = i;
		salary = sal;
		doj = dj;
	}

	public void display() {

		System.out.println("The name is: " + name + "\nThe id is: " + id + "\nThe salary is: " + salary
				+ "\nThe Joining Date is: " + doj.toString());

	}

}
