package seed_sdet_course_core_java;

public class Day_3_Account {
	
	int accNO;
	String ownerName;
	double Balance;
	
	public void init() {
		
		accNO=2483;
		ownerName= "Vishwanath Taware";
		Balance=505.5;
		
	}
	
	public void print() {
		
		
		System.out.println(accNO);
		System.out.println(ownerName);
		System.out.println(Balance);
	
	}
	
	public int getAccNO() {
		return accNO;
	}
	
	
	public void setAccNO(int accn) {
		accNO = accn;
	}

}
