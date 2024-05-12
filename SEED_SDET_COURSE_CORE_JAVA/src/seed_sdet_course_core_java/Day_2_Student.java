package seed_sdet_course_core_java;

public class Day_2_Student {

	int roll_no;
	String name;
	float percentage;
	
	public void initStudent() {
		
		roll_no=10;
		name="Vishwanath";
		percentage=78f;
		
		
	}
	
	public void printDetails() {
		
		System.out.println("The details of the students are: ");
		System.out.println("\nName:\n"+name+"\nRoll No:\n"+roll_no+"\nPercentage:\n"+percentage);
		
	}
}

