package seed_sdet_course_core_java;

public class Day_11_User_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day_11_User t1 = new Day_11_User();

		try {

			t1.init(-9);

		} catch (Day_11_User_Exception e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
		}

	}

}
