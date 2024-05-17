package seed_sdet_course_core_java;

public class Day_6_Account {

	int acc_no;
	String Name;

	public Day_6_Account(int acc_no, String Name) {

		this.acc_no = acc_no;
		this.Name = Name;

	}

	@Override
	public String toString() {

		return "The Account No is : " + acc_no + "The Name is: " + Name;
	}

}
