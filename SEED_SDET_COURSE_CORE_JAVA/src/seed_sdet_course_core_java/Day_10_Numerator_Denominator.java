package seed_sdet_course_core_java;

public class Day_10_Numerator_Denominator {

	int a, b, result;

	public Day_10_Numerator_Denominator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void divison() throws ArithmeticException, NumberFormatException {

		result = a / b;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The result is" + result;
	}

}
