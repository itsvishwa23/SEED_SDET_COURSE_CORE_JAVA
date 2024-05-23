package seed_sdet_course_core_java;

public class Day_5_Electronic_Device {

	String Brand;
	float price;

	public Day_5_Electronic_Device(String Brand, float price) {
		this.Brand = Brand;
		this.price = price;
	}

	@Override
	public String toString() {

		return "The brand is:\n" + Brand + "\nThe Price is:\n" + price;

	}

}
