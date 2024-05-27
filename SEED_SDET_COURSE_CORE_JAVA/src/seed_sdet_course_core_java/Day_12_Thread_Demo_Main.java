package seed_sdet_course_core_java;

public class Day_12_Thread_Demo_Main extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;

		for (i = 0; i <= 10; i++) {

			System.out.println("The Value of i is " + i);

		}

	}

	public static void main(String[] args) {

		try {

			Day_12_Thread_Demo_Main d1 = new Day_12_Thread_Demo_Main();
			Day_12_Thread_Demo_Main d2 = new Day_12_Thread_Demo_Main();

			d1.start();
			d2.start();

			System.out.println(d1.getName());
			d1.setName("Vishwa");
			System.out.println(d1.getName());
			System.out.println(d1.currentThread());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
