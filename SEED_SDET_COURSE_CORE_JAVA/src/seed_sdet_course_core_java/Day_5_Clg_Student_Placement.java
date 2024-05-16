package seed_sdet_course_core_java;

public class Day_5_Clg_Student_Placement {

	int cid;
	String c_Name;
	int sal;

	public Day_5_Clg_Student_Placement(int cid, String c_Name, int sal) {

		this.cid = cid;
		this.c_Name = c_Name;
		this.sal = sal;

	}

	public String toString() {
		return "The placement details are: " + "CID = " + cid + ", Company Name = " + c_Name + ", Salary = " + sal;

	}
}
