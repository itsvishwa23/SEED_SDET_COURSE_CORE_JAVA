package seed_sdet_course_core_java;

public class Day_11_Account_Main {

	public static void main(String[] args) {

		Day_11_Account d1 = new Day_11_Account(123456, "Vishwa", 20000);

		try {
			d1.withdraw(105000);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
