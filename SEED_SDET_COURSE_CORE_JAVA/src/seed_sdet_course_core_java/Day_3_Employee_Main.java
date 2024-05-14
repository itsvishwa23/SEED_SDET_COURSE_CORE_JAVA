package seed_sdet_course_core_java;

public class Day_3_Employee_Main {

	public static void main(String[] args) {

		Day_3_Employee e1 = new Day_3_Employee();
		Day_3_Employee e2 = new Day_3_Employee(2, "Vishwa", 5000.0, 1500.0);
		e1.calc_sal();
		e1.print_details();
		e2.calc_sal();
		e2.print_details();

	}

}
