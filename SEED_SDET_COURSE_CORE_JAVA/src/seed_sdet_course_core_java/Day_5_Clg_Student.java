package seed_sdet_course_core_java;

public class Day_5_Clg_Student extends Day_5_Clg_Student_Placement {

	int id;
	String name;
	String className;
	String college;

	public Day_5_Clg_Student(int cid, String c_Name, int sal, int id, String Name, String Class, String College) {
		super(cid, c_Name, sal);
		this.id = id;
		this.name = name;
		this.className = className;
		this.college = college;

	}

	@Override
	public String toString() {
		return super.toString() + ", The student details are: " + "ID = " + id + ", Name = " + name + ", Class = "
				+ className + ", College = " + college;
	}

}
