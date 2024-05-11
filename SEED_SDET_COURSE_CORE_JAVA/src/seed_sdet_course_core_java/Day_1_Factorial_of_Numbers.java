package seed_sdet_course_core_java;

public class Day_1_Factorial_of_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		int count;
		int fact=1;
		
		for(count=1;count<=num;count++)
		{
			fact=fact*count;
		}
		
		System.out.println("The factorial given number: "+num+" is "+fact);
	}

}
