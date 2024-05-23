package seed_sdet_course_core_java;

public class Day_10_Square {

	int square;
	int a;

	public Day_10_Square(int a) {

		this.a = a;

	}

	public void sqr() {

		if (a < 0)
			throw new ArithmeticException("Cannot Do It");
		square = a * a;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The Square of the given number" + a + "is: " + square;
	}
}
