package seed_sdet_course_core_java;

public class Day_5_Date {

	int dd;
	int mm;
	int yyyy;

	public Day_5_Date(int d, int m, int y) {

		dd = d;
		mm = m;
		yyyy = y;

	}

	@Override
	public String toString() {
		return "The date is: " + dd + " The month is: " + mm + " The year is: " + yyyy;
	}
}
