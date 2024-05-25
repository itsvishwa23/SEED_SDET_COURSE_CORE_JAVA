package seed_sdet_course_core_java;

import java.util.ArrayList;

public class Day_12_Employee {

	int id;
	String Name;
	double salary;

	public Day_12_Employee(int id, String Name, double salary) {
		this.id = id;
		this.Name = Name;
		this.salary = salary;
	}

	public static void emp_search(int id, ArrayList<Day_12_Employee> al) {
		boolean found = false;
		for (Day_12_Employee emp : al) {
			if (emp.id == id) {
				System.out.println(
						"Employee Found: ID = " + emp.id + ", Name = " + emp.Name + ", Salary = " + emp.salary);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Employee with ID = " + id + " not found.");
		}
	}
}
