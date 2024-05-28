package seed_sdet_course_core_java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Day_13_File_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f1 = new File("C:\\Users\\itsvi\\Desktop\\Demo.txt");

		FileInputStream f2 = new FileInputStream(f1);
		int data;
		while ((data = f2.read()) != -1) {

			System.out.print((char) data);

		}

		f2.close();

	}

}
