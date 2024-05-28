package seed_sdet_course_core_java;

import java.io.Serializable;

public class Day_13_Employee implements Serializable {

	int id;
	double salary;
	String name;

	public Day_13_Employee(int id, double salary, String name) {

		this.id = id;
		this.salary = salary;
		this.name = name;

	}
}
