package seed_sdet_course_core_java;

public class Day_5_Student {

	String name;
	int avg = 0;
	int sum;

	public void Display(String nme, int... a) {

		name = nme;
		System.out.println("The name of the student is: " + name);

		for (int i : a) {
			System.out.println("The marks are:" + i);
			sum = sum + i;

		}
		avg = sum / a.length;

		System.out.println("The average of the marks is: " + avg);
		System.out.println("The number of argument: " + a.length);
	}

}
