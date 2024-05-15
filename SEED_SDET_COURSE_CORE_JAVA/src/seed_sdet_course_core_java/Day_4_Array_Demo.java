package seed_sdet_course_core_java;

public class Day_4_Array_Demo {

	int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
	int avg = 0;
	int sum = 0;

	public void display() {

		for (int j : arr) {

			sum = sum + j;

		}

		avg = sum / 7;
		System.out.println(avg);

	}

}
