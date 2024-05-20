package seed_sdet_course_core_java;

public class Day_7_Circle extends Day_7_Shape {

	double radius;
	double area;
	final double pi = 3.14;

	Day_7_Circle(double radius) {

		this.radius = radius;
		area();

	}

	public void area() {

		area = pi * radius * radius;

	}

	@Override
	public String toString() {
		return "The Area for Circle is : " + area;
	}

}
