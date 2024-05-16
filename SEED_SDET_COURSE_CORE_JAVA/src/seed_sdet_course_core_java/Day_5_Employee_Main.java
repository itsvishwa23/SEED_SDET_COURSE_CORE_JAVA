package seed_sdet_course_core_java;

public class Day_5_Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day_5_Date d1 = new Day_5_Date(23, 05, 1998);

		Day_5_Employee e1 = new Day_5_Employee();

		e1.init("Vishwa", 1001, 500000, d1);
		e1.display();

	}

}
