package seed_sdet_course_core_java;

public class Day_7_Date {

	int dd;
	int mm;
	int yyyy;

	public Day_7_Date(int dd, int mm, int yyyy) {

		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}

	@Override
	public boolean equals(Object obj) {

		return true;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The Date is" + dd + "The Month is" + mm + "The Year uis :" + yyyy;
	}
}
