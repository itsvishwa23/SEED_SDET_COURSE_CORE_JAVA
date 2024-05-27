package seed_sdet_course_core_java;

public class Day_12_Account_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day_12_Transaction d1 = new Day_12_Transaction();
		d1.setName("Deposit");
		d1.start();

		Day_12_Transaction d2 = new Day_12_Transaction();

		d2.setName("Withdraw");
		d2.start();

	}

}
