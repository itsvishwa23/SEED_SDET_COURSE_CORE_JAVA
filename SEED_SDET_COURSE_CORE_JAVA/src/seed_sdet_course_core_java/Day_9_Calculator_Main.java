package seed_sdet_course_core_java;

public class Day_9_Calculator_Main {

	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println("The addition is " + sum);
	}

	public static void subtract(int a, int b) {
		int difference = a - b;
		System.out.println("The subtraction is " + difference);
	}

	public static void multiply(int a, int b) {
		int product = a * b;
		System.out.println("The multiplication is " + product);
	}

	public static void divide(int a, int b) {
		if (b != 0) {
			int quotient = a / b;
			System.out.println("The division is " + quotient);
		} else {
			System.out.println("Division by zero is not allowed.");
		}
	}

	public static void main(String[] args) {

		String calc = "Addition";

		switch (calc) {
		case "Addition":
			add(10, 20);
			System.exit(0);
			break;
		case "Subtraction":
			subtract(10, 20);
			break;
		case "Multiplication":
			multiply(10, 20);
			break;
		case "Division":
			divide(10, 20);
			break;
		default:
			System.err.println("Invalid Input.");

		}

	}

}
