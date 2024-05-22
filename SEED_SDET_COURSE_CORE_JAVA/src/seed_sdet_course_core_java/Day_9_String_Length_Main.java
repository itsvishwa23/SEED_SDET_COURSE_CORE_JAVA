package seed_sdet_course_core_java;

public class Day_9_String_Length_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day_9_String_Length t;

		t = (String name) -> {

			int len = 0;

			len = name.length();

			return len;
		};

		String name = "Vishwa";
		int length = t.strlength(name);
		System.out.println("Length of the string \"" + name + "\" is: " + length);

	}

}
