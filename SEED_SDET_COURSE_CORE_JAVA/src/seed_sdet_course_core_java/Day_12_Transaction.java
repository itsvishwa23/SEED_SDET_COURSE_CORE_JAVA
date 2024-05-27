package seed_sdet_course_core_java;

public class Day_12_Transaction extends Thread {

	int amt;

	Day_12_Account d = new Day_12_Account();

	public void deposit(int amt) {

		synchronized (d) {

			int a = d.get_balance();
			a = a + amt;

			System.out.println("The Updated Balance after Deposit is : " + amt);

		}

	}

	public void withdraw(int amt) {

		synchronized (d) {

			int b = d.get_balance();
			b = b - amt;

			System.out.println("The Updated Balance after Withdraw is : " + amt);

		}

	}

	@Override
	public void run() {

		if (Thread.currentThread().getName().equals("Deposit")) {
			deposit(15000);

		}

		else {
			withdraw(10000);
		}

	}

}
