package seed_sdet_course_core_java;

import java.io.File;

public class Day_10_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			File obj = new File("myfile.txt");
			obj.delete();
			System.out.println("File Created!");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
