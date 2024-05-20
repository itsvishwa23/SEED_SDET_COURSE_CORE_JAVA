package seed_sdet_course_core_java;

public class Day_7_Date_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day_7_Date d1 = new Day_7_Date(23, 05, 1998);
		Day_7_Date d2 = new Day_7_Date(23, 05, 1928);
		boolean check = d2.equals(d1);

		System.out.println(check);

		System.out.println(d1.hashCode());

	}

}
