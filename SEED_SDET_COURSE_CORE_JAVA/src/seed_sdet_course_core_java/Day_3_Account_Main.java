package seed_sdet_course_core_java;

public class Day_3_Account_Main {

	public static void main(String[] args) {
		
		Day_3_Account a1= new Day_3_Account();
		a1.init();
		a1.print();
		a1.getAccNO();
		a1.setAccNO(2433);
		System.out.println("The Updated Details are");
		a1.print();	
	}

}
