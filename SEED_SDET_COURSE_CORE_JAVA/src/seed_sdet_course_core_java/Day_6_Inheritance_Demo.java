package seed_sdet_course_core_java;

public class Day_6_Inheritance_Demo {
	public static void main(String[] args) {
		Day_6_Wage_Employee d1 = new Day_6_Wage_Employee();
		d1.calculate();
		d1.display();

		Day_6_Sales_Person s1 = new Day_6_Sales_Person();
		s1.calculate();
		s1.display();
	}
}
