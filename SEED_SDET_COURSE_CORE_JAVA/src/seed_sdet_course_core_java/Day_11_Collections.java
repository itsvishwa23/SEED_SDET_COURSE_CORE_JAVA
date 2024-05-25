package seed_sdet_course_core_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Day_11_Collections {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		ArrayList<Integer> e = new ArrayList<Integer>();
		LinkedList<Integer> q = new LinkedList<Integer>();
		e.add(100);
		e.add(10);
		System.out.println(e);
		a.add("Vishwa");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		q.add(50);
		System.out.println(q);

		Day_7_Employee r = new Day_7_Employee();
		ArrayList t = new ArrayList();
		t.add(r);
		System.out.println(r);
		Collections.sort(e);

		System.out.println(e);

	}
}
