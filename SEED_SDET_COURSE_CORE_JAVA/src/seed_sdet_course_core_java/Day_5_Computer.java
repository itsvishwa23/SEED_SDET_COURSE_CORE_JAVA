package seed_sdet_course_core_java;

public class Day_5_Computer extends Day_5_Electronic_Device {

	int ram;
	int hard_disk;

	public Day_5_Computer(String Brand, int price, int ram, int hard_disk) {

		super(Brand, price);
		this.ram = ram;
		this.hard_disk = hard_disk;
	}

	@Override
	public String toString() {

		return super.toString() + "\nThe Ram is:\n" + ram + "\nThe Hard Disk Space is:\n" + hard_disk;
	}

}
