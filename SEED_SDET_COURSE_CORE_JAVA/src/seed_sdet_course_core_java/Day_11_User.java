package seed_sdet_course_core_java;

public class Day_11_User {

	int a;

	public void init(int a) throws Day_11_User_Exception {

		this.a = a;
		if (a < 0)
			throw new Day_11_User_Exception("Cannot Assign Zero");

		System.out.println(a);

	}

}
