package seed_sdet_course_core_java;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Day_13_Employee_Main implements Serializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day_13_Employee a1 = new Day_13_Employee(101, 5000, "Vishwa");

		try {

			FileOutputStream file = new FileOutputStream("C:\\Users\\itsvi\\Desktop\\Demo.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(a1);

			out.close();

			file.close();

			System.out.println("Object has been serialized");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
