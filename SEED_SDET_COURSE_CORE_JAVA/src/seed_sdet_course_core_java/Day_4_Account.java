package seed_sdet_course_core_java;

public class Day_4_Account {

	String Name;
	int accno;
	public static int int_rate;

	public Day_4_Account() {
		Name = "Vishwanath Taware";
		accno = 6004;

	}

	static {

		int_rate = 9;

	}

	public static void show_int_rate() {

		System.out.println(int_rate);

	}

	public void show_details() {

		System.out.println(Name);
		System.out.println(accno);
		show_int_rate();

	}
}
