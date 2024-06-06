package seed_sdet_course_core_java;

import java.util.ArrayList;
import java.util.Collections;

public class Day_15_Collection_Practise_Array_List {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(20);
		al.remove(5);
		Collections.sort(al);
		for (Object O : al) {

			System.out.println(al);

		}
	}

}
