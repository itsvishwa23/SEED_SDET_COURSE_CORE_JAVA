package seed_sdet_course_core_java;



public class Day_3_Account {
	
	int accNO;
	String ownerName;
	double Balance;
	
	
	public Day_3_Account(int x, String s, double b) {
		
		System.out.println(" Parametrized Constructor Implemented");
		accNO=x;
		ownerName=s;
		Balance=b;
		
		
	}
	
	public Day_3_Account() {
		
		System.out.println("Constructor Implemented");
		accNO=000;
		ownerName= "Demo";
		Balance=000.0;
		
		
	}
	
	
	
	public void init() {
		
		accNO=2483;
		ownerName= "Vishwanath Sopan Taware";
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
