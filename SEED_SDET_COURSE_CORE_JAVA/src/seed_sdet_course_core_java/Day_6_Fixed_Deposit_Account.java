package seed_sdet_course_core_java;

public class Day_6_Fixed_Deposit_Account extends Day_6_Account {

	float fd_amount;

	public Day_6_Fixed_Deposit_Account(int acc_no, String Name, float fd_amount) {
		super(acc_no, Name);
		this.fd_amount = fd_amount;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "The fd amount is " + fd_amount;
	}

}
