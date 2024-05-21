package seed_sdet_course_core_java;

public class Day_7_Add {

	static int a, b;

	public Day_7_Add(int a, int b) {

		this.a = a;
		this.b = b;

	}

}

class Calculator {
	// Method to add two numbers
	public int addNumbers(Number number) {
		return Day_7_Add.a + Day_7_Add.b;
	}
}