package seed_sdet_course_core_java;

public class Day_9_Cube_Main {

	static int a = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day_9_Cube c;
		c = (a) -> {

			int reuslt;
			reuslt = a * a * a;
			System.out.println(reuslt);

		};

		c.cube(a);
	}

}
