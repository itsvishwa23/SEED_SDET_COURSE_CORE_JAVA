package seed_sdet_course_core_java;

public class Day_5_Electronic_Device_Main {

	public static void main(String[] args) {

		try {

			Day_5_Computer d1 = new Day_5_Computer("Dell", 50000, 5, 500);

			Day_5_TV d2 = new Day_5_TV("Samsung", 60000, 32, "Android TV");

			System.out.println(d1);
			System.out.println(d2);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
