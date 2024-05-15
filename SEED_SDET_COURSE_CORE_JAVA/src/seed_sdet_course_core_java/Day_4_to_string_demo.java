package seed_sdet_course_core_java;

public class Day_4_to_string_demo {

	int id;
	String Name;

	Day_4_to_string_demo(int id, String name) {

		this.id = id;
		this.Name = name;

	}

	@Override
	public String toString() {

		return "The id is " + id + "The Name is : " + Name;

	}
}
