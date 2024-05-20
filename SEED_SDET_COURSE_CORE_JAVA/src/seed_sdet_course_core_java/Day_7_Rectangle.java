package seed_sdet_course_core_java;

public class Day_7_Rectangle extends Day_7_Shape {

	double length;
	double breadth;
	double area;

	Day_7_Rectangle(double length, double breadth) {

		this.length = length;
		this.breadth = breadth;
		area();
	}

	public void area() {

		area = length * breadth;

	}

	@Override
	public String toString() {
		return "The Area for Rectangle is : " + area;
	}

}
