package seed_sdet_course_core_java;

public class Day_6_Sales_Person extends Day_6_Wage_Employee {
	int sales;
	float commission;
	int sales_per_Sal;

	public Day_6_Sales_Person() {
		this.sales = 500;
		this.commission = 3;
	}

	public Day_6_Sales_Person(int sales, float commission) {
		this.sales = sales;
		this.commission = commission;
	}

	@Override
	public void calculate() {

		sales_per_Sal = (int) (total_salary + (sales * commission));
	}

	@Override
	public void display() {

		System.out.println("Total salary for Sales Person is: " + sales_per_Sal);
	}
}
