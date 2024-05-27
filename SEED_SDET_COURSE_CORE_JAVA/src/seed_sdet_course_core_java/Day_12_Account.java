package seed_sdet_course_core_java;

public class Day_12_Account {

	int balance = 50000;

	public void set_balance(int balance) {

		this.balance = balance;

	}

	public int get_balance() {

		return balance;

	}

	@Override
	public String toString() {

		return "Balace" + balance;
	}

}
