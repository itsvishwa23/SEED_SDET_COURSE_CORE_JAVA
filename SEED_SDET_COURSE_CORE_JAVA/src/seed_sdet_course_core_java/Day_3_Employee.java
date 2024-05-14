package seed_sdet_course_core_java;

public class Day_3_Employee {

	int eid;
	String ename;
	double basic_sal;
	double hra;
	double medical;
	double pf;
	double pt;
	double net_sal;
	double gross_sal;

	public Day_3_Employee() {

		this.eid = 1;
		this.ename = "Demo";
		this.basic_sal = 1.1;
		this.hra = basic_sal / 2;
		this.medical = 1.1;
		this.pf = 0.12 * basic_sal;
		this.pt = 200;
	}

	public Day_3_Employee(int eid, String ename, double basic_sal, double hra) {
		this.eid = eid;
		this.ename = ename;
		this.basic_sal = basic_sal;
		this.hra = basic_sal / 2;
		this.medical = medical;
		this.pf = 0.12 * basic_sal;
		this.pt = 200;

	}

	public void calc_sal() {

		gross_sal = basic_sal + hra + medical;
		net_sal = gross_sal - (pt + pf);

	}

	public void print_details() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(gross_sal);
		System.out.println(net_sal);

	}
}