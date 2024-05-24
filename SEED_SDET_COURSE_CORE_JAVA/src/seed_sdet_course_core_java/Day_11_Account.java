package seed_sdet_course_core_java;

public class Day_11_Account {

	int accno;
	String name;
	double balance;

	public Day_11_Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(int amt) {

		try {
			if (balance - amt < 1000) {
				throw new Day_11_Insufficent_Balance_Exception(
						"Insufficient balance. Minimum balance of 1000 must be maintained.");
			} else {
				balance = balance - amt;
				System.out.println("The Updated Balance is: " + balance);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
}
