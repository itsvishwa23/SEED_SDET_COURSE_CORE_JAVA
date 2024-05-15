package seed_sdet_course_core_java;

public class Day_4_Customer_2 {

	public static int obj_counter;
	public String c_name;

	public void init(String c_nme) {

		int temp = obj_counter + 1;
		c_name = c_nme;

		obj_counter = obj_counter + 1;

	}

	public void display() {
		System.out.println(c_name);
		System.out.println("Total Customers");
		System.out.println(obj_counter);

	}

}
