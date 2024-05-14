package seed_sdet_course_core_java;

public class Day_3_this_demo {

	int a;
	int b;

	public Day_3_this_demo(int a, int b) {

		a = a;
		this.b = b;
		// TODO Auto-generated constructor stub
	}

	public void print() {

		System.out.println(a);
		System.out.println(a);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day_3_this_demo d1 = new Day_3_this_demo(1, 2);
		d1.print();

	}

}
