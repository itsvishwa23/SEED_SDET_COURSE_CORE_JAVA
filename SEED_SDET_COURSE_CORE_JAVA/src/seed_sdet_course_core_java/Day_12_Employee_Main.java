package seed_sdet_course_core_java;

import java.util.ArrayList;
import java.util.Scanner;

public class Day_12_Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int id;

		ArrayList l1 = new ArrayList();
		l1.add(new Day_12_Employee(101, "Vishwa", 5005));
		l1.add(new Day_12_Employee(102, "Ram", 1000));
		l1.add(new Day_12_Employee(105, "Sham", 505));
		l1.add(new Day_12_Employee(107, "Karan", 8005));
		l1.add(new Day_12_Employee(109, "Rajan", 1005));

		System.out.println("Enter id to search");
		id = sc.nextInt();
		Day_12_Employee.emp_search(id, l1);
	}

}
