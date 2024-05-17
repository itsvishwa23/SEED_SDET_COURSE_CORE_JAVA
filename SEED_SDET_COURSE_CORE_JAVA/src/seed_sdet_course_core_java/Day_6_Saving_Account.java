package seed_sdet_course_core_java;

public class Day_6_Saving_Account extends Day_6_Account {

	float balance;

	public Day_6_Saving_Account(int acc_no, String Name, float balance) {

		super(acc_no, Name);
		this.balance = balance;

	}

	@Override
	public String toString() {

		return super.toString() + "The Balance is :" + balance;
	}

}
