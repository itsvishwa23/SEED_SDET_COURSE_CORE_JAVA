package seed_sdet_course_core_java;

public class Day_4_Customer {
	int customerid;
	String custname;
	String city;

	public Day_4_Customer() {
		this.customerid = 101;
		this.custname = "Vishwanath Taware";
		this.city = "Pune";

	}

	public Day_4_Customer(int customerid, String custname, String city) {
		this.customerid = customerid;
		this.custname = custname;
		this.city = city;

	}

	public void print() {

		System.out.println(customerid);
		System.out.println(custname);
		System.out.println(city);

	}

}
