package seed_sdet_course_core_java;

public class Day_5_TV extends Day_5_Electronic_Device {

	int size;
	String tv_type;

	Day_5_TV(String Brand, int price, int size, String tv_type) {

		super(Brand, price);
		this.size = size;
		this.tv_type = tv_type;

	}

	@Override
	public String toString() {

		return super.toString() + "\nThe Size is:\n" + size + "\nThe TV Type is:\n" + tv_type;

	}

}
