package seed_sdet_course_core_java;

public class Day_14_Geneirc_Function {

	public static void main(String[] args) {
		Double arr[] = { 10.2, 20.0, 30.0, 40.0 };
		print(arr);
	}

	public static <T> void print(T arr[]) {
		for (T j : arr) {
			System.out.println(j);
		}
	}
}
