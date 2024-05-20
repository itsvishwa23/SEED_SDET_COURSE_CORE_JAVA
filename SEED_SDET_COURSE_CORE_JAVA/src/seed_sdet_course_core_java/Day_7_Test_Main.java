package seed_sdet_course_core_java;

public class Day_7_Test_Main {

	public void test(Day_7_Simple_Phone d) {

		System.out.println("Call");

	}

	public static void main(String[] args) {

		Day_7_Simple_Phone d1 = new Day_7_Simple_Phone();
		d1.Makecall();
		Day_7_Mobile_Phone d2 = new Day_7_Smart_Phone();
		d2.Makecall();

	}

}
