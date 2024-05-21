package seed_sdet_course_core_java;

public class Day_8_Ball implements Day_8_Bouncebale, Day_8_Movebale {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("This Method is from Movebale Interface");
	}

	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		System.out.println("This Method is from Bouncebale Interface");
	}

	public void test() {

		Day_8_Bouncebale.super.print();

	}

}
